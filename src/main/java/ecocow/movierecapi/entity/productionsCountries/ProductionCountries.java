package ecocow.movierecapi.entity.productionsCountries;

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
@Table(name = "PRODUCTION_COUNTRIES")
@Getter
public class ProductionCountries extends BaseEntity {

    @Id
    @Column(name = "COUNTRY_ID")
    private Long countryId;

    @Column(name = "ISO_3166_1")
    private String iso31661;

    @Column(name = "NAME")
    private String name;

    public ProductionCountriesDto toDto() {
        ProductionCountriesDto dto = new ProductionCountriesDto();
        dto.setCountryId(this.countryId);
        dto.setIso31661(this.iso31661);
        dto.setName(this.name);
        dto.setRegDate(this.getRegDate());
        dto.setUpdDate(this.getUpdDate());
        return dto;
    }
}
