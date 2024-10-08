package ecocow.movierecapi.repository;

import ecocow.movierecapi.entity.genre.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {

    Genre findByGenreId(Long genreId);
}
