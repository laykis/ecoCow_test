package ecocow.movierecapi.entity;

import ecocow.movierecapi.util.converter.StringListConverter;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "MOVIE")
@Getter
public class Movie extends BaseEntity {

    @Id
    @Column(name = "MOVIE_ID")
    private Long movieId;

    @Column(name = "ADULT_YN")
    private String adultYn;

    @Column(name = "BACKDROP_PATH")
    private String backdropPath;

    @Column(name = "BUDGET")
    private Long budget;

    @Column(name = "HOMEPAGE")
    private String homepage;

    @Column(name = "IMDB_ID")
    private String imdbId;

    @Convert(converter = StringListConverter.class)
    @Column(name = "ORIGIN_COUNTRY")
    private List<String> originCountry;

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
