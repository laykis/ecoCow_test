package ecocow.movierecapi.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductionCompanies extends BaseEntity{

    @Id
    private Long companyId;

}
