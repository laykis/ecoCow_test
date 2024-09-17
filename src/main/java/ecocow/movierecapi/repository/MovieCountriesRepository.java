package ecocow.movierecapi.repository;

import ecocow.movierecapi.entity.movieCountries.MovieCountries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieCountriesRepository extends JpaRepository<MovieCountries, Long> {

    List<MovieCountries> findAllByMovieId(Long movieId);
}
