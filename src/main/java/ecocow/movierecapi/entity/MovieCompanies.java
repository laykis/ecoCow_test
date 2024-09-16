package ecocow.movierecapi.entity;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Table(name = "MOVIE_COMPANIES")
public class MovieCompanies extends BaseEntity{

    @Id
    @Column(name = "MOVIE_COMPANY_ID")
    private Long movieCompanyId;

    @Column(name = "MOVIE_ID")
    private Long movieId;

    @Column(name = "COMPANY_ID")
    private Long companyId;

}
