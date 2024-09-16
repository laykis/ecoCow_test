package ecocow.movierecapi.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MOVIE_COMPANIES")
public class MovieCompanies {

    @Id
    private Long movieComId;
}
