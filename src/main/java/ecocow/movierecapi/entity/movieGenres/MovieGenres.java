package ecocow.movierecapi.entity.movieGenres;

import ecocow.movierecapi.entity.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.experimental.SuperBuilder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Table(name = "MOVIE_GENRES")
public class MovieGenres extends BaseEntity{

    @Id
    @Column(name = "MOVIE_GENRE_ID")
    private Long movieGenreId;

    @Column(name = "MOVIE_ID")
    private Long movieId;

    @Column(name = "GENRE_ID")
    private Long genreId;

    public MovieGenresDto toDto() {
        MovieGenresDto dto = new MovieGenresDto();

        dto.setMovieGenreId(movieGenreId);
        dto.setMovieId(movieId);
        dto.setGenreId(genreId);
        dto.setRegDate(this.getRegDate());
        dto.setUpdDate(this.getUpdDate());

        return dto;
    }
}
