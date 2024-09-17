package ecocow.movierecapi.repository;

import ecocow.movierecapi.entity.movieCollections.MovieCollections;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieCollectionsRepository extends JpaRepository<MovieCollections, Long> {

    List<MovieCollections> findAllByMovieId(Long movieId);
}
