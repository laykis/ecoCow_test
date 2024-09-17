package ecocow.movierecapi.repository;

import ecocow.movierecapi.entity.movieLanguages.MovieLanguages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieLanguagesRepository extends JpaRepository<MovieLanguages, Long> {
}
