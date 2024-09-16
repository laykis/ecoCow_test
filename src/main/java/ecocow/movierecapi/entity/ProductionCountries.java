package ecocow.movierecapi.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductionCountries extends BaseEntity{

    @Id
    private Long countryId;
}
