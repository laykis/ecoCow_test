package ecocow.movierecapi.entity.productionsCountries;

import ecocow.movierecapi.entity.base.BaseDto;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductionCountriesDto extends BaseDto implements Serializable {
    private Long countryId;
    private String iso31661;
    private String name;

    public ProductionCountries toEntity() {
        return ProductionCountries.builder()
                .countryId(this.countryId)
                .iso31661(this.iso31661)
                .name(this.name)
                .regDate(this.getRegDate())
                .updDate(this.getUpdDate())
                .build();
    }
}