package ecocow.movierecapi.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCTION_COMPANIES")
public class ProductionCompanies extends BaseEntity{

    @Id
    private Long companyId;

}
