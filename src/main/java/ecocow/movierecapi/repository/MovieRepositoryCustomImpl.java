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

        // 장르별로 최고 평점을 가진 영화들을 담기 위한 Map
        Map<Long, Movie> topRatedMoviesByGenre = new HashMap<>();

        // 장르별로 영화들을 그룹화
        topRatedMovies.stream()
                .collect(Collectors.groupingBy(movieItem -> {
                    Long genreId = queryFactory
                            .select(movieGenres.genreId)
                            .from(movieGenres)
                            .where(movieGenres.movieId.eq(movieItem.getMovieId()))
                            .fetchOne();
                    return genreId != null ? genreId : -1L; // null 방지
                }))
                .forEach((genreId, movies) -> {
                    // 장르별로 최고 평점을 가진 영화 찾기
                    movies.stream()
                            .max(Comparator.comparing(movieItem -> Optional.ofNullable(movieItem.getVoteAverage()).orElse(0.0f)))
                            .ifPresent(topRatedMovie -> topRatedMoviesByGenre.put(genreId, topRatedMovie));
                });

        // Map을 List<MovieDto>로 변환
        return topRatedMoviesByGenre.values().stream()
                .map(Movie::toDto)
                .collect(Collectors.toList());
    }


}



