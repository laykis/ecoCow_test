package ecocow.movierecapi.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MOVIE_LANGUAGES")
public class MovieLanguages {

    @Id
    private Long movieLangId;

}
