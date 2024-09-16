package ecocow.movierecapi.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCTION_COUNTRIES")
public class ProductionCountries extends BaseEntity{

    @Id
    private Long countryId;
}
