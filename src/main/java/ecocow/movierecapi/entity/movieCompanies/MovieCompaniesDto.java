package ecocow.movierecapi.entity.movieCompanies;

import ecocow.movierecapi.entity.base.BaseDto;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MovieCompaniesDto extends BaseDto implements Serializable {
    private Long movieCompanyId;
    private Long movieId;
    private Long companyId;

    public MovieCompanies toEntity() {
        return MovieCompanies.builder()
                .movieCompanyId(this.movieCompanyId)
                .movieId(this.movieId)
                .companyId(this.companyId)
                .regDate(this.getRegDate())
                .updDate(this.getUpdDate())
                .build();
    }
}