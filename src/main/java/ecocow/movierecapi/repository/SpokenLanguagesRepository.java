package ecocow.movierecapi.repository;

import ecocow.movierecapi.entity.spokenLanguages.SpokenLanguages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpokenLanguagesRepository extends JpaRepository<SpokenLanguages, Long> {
    SpokenLanguages findByLangId(Long langId);
}
