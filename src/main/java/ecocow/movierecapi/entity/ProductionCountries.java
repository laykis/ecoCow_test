package ecocow.movierecapi.entity;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCTION_COUNTRIES")
@Getter
public class ProductionCountries extends BaseEntity{

    @Id
    @Column(name = "COUNTRY_ID")
    private Long countryId;

    @Column(name = "ISO_3166_1")
    private String iso31661;

    @Column(name = "NAME")
    private String name;
}
