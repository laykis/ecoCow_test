package ecocow.movierecapi.repository;

import ecocow.movierecapi.entity.movieCompanies.MovieCompanies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieCompaniesRepository extends JpaRepository<MovieCompanies, Long> {

    List<MovieCompanies> findAllByMovieId(Long movieId);
}
