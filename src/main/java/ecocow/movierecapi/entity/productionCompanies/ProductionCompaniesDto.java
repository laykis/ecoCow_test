package ecocow.movierecapi.entity.productionCompanies;

import ecocow.movierecapi.entity.base.BaseDto;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductionCompaniesDto extends BaseDto implements Serializable {
    private Long companyId;
    private String logoPath;
    private String name;
    private String originCountry;

    public ProductionCompanies toEntity(){
        return ProductionCompanies.builder()
                .companyId(this.companyId)
                .logoPath(this.logoPath)
                .name(this.name)
                .originCountry(this.originCountry)
                .build();
    }
}