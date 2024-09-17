package ecocow.movierecapi.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import ecocow.movierecapi.entity.movie.Movie;
import ecocow.movierecapi.entity.movie.MovieDto;
import ecocow.movierecapi.entity.movie.QMovie;
import ecocow.movierecapi.entity.movieGenres.QMovieGenres;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.*;
import java.util.stream.Collectors;

@Repository
@Transactional
public class MovieRepositoryCustomImpl implements MovieRepositoryCustom {

    private final JPAQueryFactory queryFactory;

    public MovieRepositoryCustomImpl(EntityManager em) {
        this.queryFactory = new JPAQueryFactory(em);
    }

    @Override
    public List<MovieDto> findTopRatedMoviesByGenres(List<Long> genreIds) {
        QMovie movie = QMovie.movie;
        QMovieGenres movieGenres = QMovieGenres.movieGenres;

        // 각 장르별로 최고 평가의 영화 1개를 찾기 위한 서브쿼리
        List<Movie> topRatedMovies = queryFactory
                .select(movie)
                .from(movie)
                .join(movieGenres).on(movie.movieId.eq(movieGenres.movieId))
                .where(movieGenres.genreId.in(genreIds))
                .orderBy(movie.voteAverage.desc())
                .fetch();

        // 장르별로 최고 영화 1개를 찾기 위해 Map으로 변환
        Map<Long, List<Movie>> moviesByGenre = topRatedMovies.stream()
                .collect(Collectors.groupingBy(movieItem -> {
                    // 영화의 장르를 조회
                    List<Long> genreIdsForMovie = queryFactory
                            .select(movieGenres.genreId)
                            .from(movieGenres)
                            .where(movieGenres.movieId.eq(movieItem.getMovieId()))
                            .fetch();

                    // 장르가 여러 개인 경우 첫 번째 장르를 선택
                    return genreIdsForMovie.isEmpty() ? -1L : genreIdsForMovie.get(0);
                }));

        // 장르별로 최고 평점을 가진 영화 찾기
        return moviesByGenre.entrySet().stream()
                .map(entry -> {
                    Long genreId = entry.getKey();
                    List<Movie> movies = entry.getValue();

                    // 장르별로 최고 평점을 가진 영화 찾기
                    return movies.stream()
                            .max(Comparator.comparing(movieItem -> Optional.ofNullable(movieItem.getVoteAverage()).orElse(0.0f)))
                            .map(Movie::toDto)
                            .orElse(null);
                })
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }


}



