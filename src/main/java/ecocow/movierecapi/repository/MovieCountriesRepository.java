package ecocow.movierecapi.repository;

import ecocow.movierecapi.entity.MovieCountries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieCountriesRepository extends JpaRepository<MovieCountries, Long> {
}
