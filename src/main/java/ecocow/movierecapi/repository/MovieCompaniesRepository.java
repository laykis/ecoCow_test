package ecocow.movierecapi.repository;

import ecocow.movierecapi.entity.movieCompanies.MovieCompanies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieCompaniesRepository extends JpaRepository<MovieCompanies, Long> {
}
