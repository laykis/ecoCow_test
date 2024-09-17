package ecocow.movierecapi.entity.productionCompanies;

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
@Table(name = "PRODUCTION_COMPANIES")
@Getter
public class ProductionCompanies extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "COMPANY_ID")
    private Long companyId;

    @Column(name = "LOGO_PATH")
    private String logoPath;

    @Column(name = "NAME")
    private String name;

    @Column(name = "ORIGIN_COUNTRY")
    private String originCountry;

    public ProductionCompaniesDto toDto() {
        ProductionCompaniesDto dto = new ProductionCompaniesDto();
        dto.setCompanyId(this.companyId);
        dto.setLogoPath(this.logoPath);
        dto.setName(this.name);
        dto.setOriginCountry(this.originCountry);
        dto.setRegDate(this.getRegDate());
        dto.setUpdDate(this.getUpdDate());
        return dto;
    }

}
