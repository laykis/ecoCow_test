package ecocow.movierecapi.entity;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Getter
public class Movie extends BaseEntity {

    @Id
    private Long mid;

    @Column(name = "ADULT_YN")
    private String adultYn;

    @Column(name = "BACKDROP_PATH")
    private String backdropPath;

    @Column(name = "BELONGS_TO_COLLECTION")
    private String belongsToCollection;

    @Column(name = "BUDGET")
    private Long budget;

    @Column(name = "HOMEPAGE")
    private String homepage;

    @Column(name = "IMDB_ID")
    private String imdbId;

    //TODO - origin_country List? String? 확정필요
    @Column(name = "ORIGIN_COUNTRY")
    private String originCountry;

    @Column(name = "ORIGINAL_LANGUAGE")
    private String originalLanguage;

    @Column(name = "ORIGINAL_TITLE")
    private String originalTitle;

    @Column(name = "OVERVIEW")
    private String overview;

    @Column(name = "POPULARITY")
    private Float popularity;

    @Column(name = "POSTER_PATH")
    private String posterPath;

    @Column(name = "RELEASE_DATE")
    private LocalDate releaseDate;

    @Column(name = "REVENUE")
    private Long revenue;

    @Column(name = "RUNTIME")
    private Integer runtime;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "TAGLINE")
    private String tagLine;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "VIDEO_YN")
    private String videoYn;

    @Column(name = "VOTE_AVERAGE")
    private Float voteAverage;

    @Column(name = "VOTE_COUNT")
    private Integer voteCount;
}
