package ecocow.movierecapi.entity.movieLanguages;

import ecocow.movierecapi.entity.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.experimental.SuperBuilder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Table(name = "MOVIE_LANGUAGES")
public class MovieLanguages extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "MOVIE_LANG_ID")
    private Long movieLangId;

    @Column(name = "MOVIE_ID")
    private Long movieId;

    @Column(name = "LANG_ID")
    private Long langId;

    public MovieLanguagesDto toDto() {
        MovieLanguagesDto dto = new MovieLanguagesDto();
        dto.setMovieLangId(this.movieLangId);
        dto.setMovieId(this.movieId);
        dto.setLangId(this.langId);
        dto.setRegDate(this.getRegDate());
        dto.setUpdDate(this.getUpdDate());
        return dto;
    }

}
