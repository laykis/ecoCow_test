package ecocow.movierecapi.entity.movieCountries;

import ecocow.movierecapi.entity.base.BaseDto;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MovieCountriesDto extends BaseDto implements Serializable {
    private Long movieCountryId;
    private Long movieId;
    private Long countryId;

    public MovieCountries toEntity() {
        return MovieCountries.builder()
                .movieCountryId(this.movieCountryId)
                .movieId(this.movieId)
                .countryId(this.countryId)
                .regDate(this.getRegDate())
                .updDate(this.getUpdDate())
                .build();
    }
}