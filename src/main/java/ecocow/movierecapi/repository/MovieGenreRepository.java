package ecocow.movierecapi.repository;

import ecocow.movierecapi.entity.movieGenres.MovieGenres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieGenreRepository extends JpaRepository<MovieGenres, Long> {

    List<MovieGenres> findAllByMovieId(Long movieId);
}
