package ecocow.movierecapi.repository;

import ecocow.movierecapi.entity.spokenLanguages.SpokenLanguages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpokenLanguagesRepository extends JpaRepository<SpokenLanguages, Long> {
}
