package ecocow.movierecapi.entity;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Table(name = "MOVIE_COUNTRIES")
public class MovieCountries extends BaseEntity{

    @Id
    @Column(name = "MOVIE_COUNTRY_ID")
    private Long movieCountryId;

    @Column(name = "MOVIE_ID")
    private Long movieId;

    @Column(name = "COUNTRY_ID")
    private Long countryId;


}
