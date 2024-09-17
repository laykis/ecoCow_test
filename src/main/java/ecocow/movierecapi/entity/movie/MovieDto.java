package ecocow.movierecapi.entity.movie;

import ecocow.movierecapi.entity.base.BaseDto;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MovieDto extends BaseDto implements Serializable {
    private Long movieId;
    private String adultYn;
    private String backdropPath;
    private Long budget;
    private String homepage;
    private String imdbId;
    private List<String> originCountry;
    private String originalLanguage;
    private String originalTitle;
    private String overview;
    private Float popularity;
    private String posterPath;
    private LocalDate releaseDate;
    private Long revenue;
    private Integer runtime;
    private String status;
    private String tagLine;
    private String title;
    private String videoYn;
    private Float voteAverage;
    private Integer voteCount;

    public Movie toEntity() {

        return Movie.builder()
                .movieId(this.movieId)
                .adultYn(this.adultYn)
                .backdropPath(this.backdropPath)
                .budget(this.budget)
                .homepage(this.homepage)
                .imdbId(this.imdbId)
                .originCountry(this.originCountry)
                .originalLanguage(this.originalLanguage)
                .originalTitle(this.originalTitle)
                .overview(this.overview)
                .popularity(this.popularity)
                .posterPath(this.posterPath)
                .releaseDate(this.releaseDate)
                .revenue(this.revenue)
                .runtime(this.runtime)
                .tagLine(this.tagLine)
                .title(this.title)
                .videoYn(this.videoYn)
                .voteAverage(this.voteAverage)
                .voteCount(this.voteCount)
                .regDate(this.getRegDate())
                .updDate(this.getUpdDate())
                .build();
    }

}