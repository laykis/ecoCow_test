package ecocow.movierecapi.entity;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Table(name = "MOVIE_LANGUAGES")
public class MovieLanguages extends BaseEntity{

    @Id
    @Column(name = "MOVIE_LANG_ID")
    private Long movieLangId;

    @Column(name = "MOVIE_ID")
    private Long movieId;

    @Column(name = "LANG_ID")
    private Long langId;


}
