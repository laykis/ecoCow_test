package ecocow.movierecapi.repository;

import ecocow.movierecapi.entity.MovieCollections;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieCollectionsRepository extends JpaRepository<MovieCollections, Long> {
}
