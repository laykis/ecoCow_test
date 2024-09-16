package ecocow.movierecapi.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MOVIE_COUNTRIES")
public class MovieCountries {

    @Id
    private Long movieCounId;
}
