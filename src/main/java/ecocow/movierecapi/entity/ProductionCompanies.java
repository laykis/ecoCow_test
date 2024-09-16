package ecocow.movierecapi.entity;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.print.attribute.standard.MediaSize;

@Entity
@Table(name = "PRODUCTION_COMPANIES")
@Getter
public class ProductionCompanies extends BaseEntity{

    @Id
    @Column(name = "COMPANY_ID")
    private Long companyId;

    @Column(name = "LOGO_PATH")
    private String logoPath;

    @Column(name = "NAME")
    private String name;

    @Column(name = "ORIGIN_COUNTRY")
    private String originCountry;


}
