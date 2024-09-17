package ecocow.movierecapi.entity.movieCountries;

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
@Table(name = "MOVIE_COUNTRIES")
public class MovieCountries extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "MOVIE_COUNTRY_ID")
    private Long movieCountryId;

    @Column(name = "MOVIE_ID")
    private Long movieId;

    @Column(name = "COUNTRY_ID")
    private Long countryId;

    public MovieCountriesDto toDto() {

        MovieCountriesDto dto = new MovieCountriesDto();

        dto.setMovieId(this.movieId);
        dto.setCountryId(this.countryId);
        dto.setMovieCountryId(this.movieCountryId);
        dto.setRegDate(this.getRegDate());
        dto.setUpdDate(this.getUpdDate());
        return dto;
    }


}
