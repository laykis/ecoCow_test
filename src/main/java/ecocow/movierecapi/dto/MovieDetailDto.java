package ecocow.movierecapi.dto;

import ecocow.movierecapi.entity.collection.CollectionDto;
import ecocow.movierecapi.entity.genre.GenreDto;
import ecocow.movierecapi.entity.movie.MovieDto;
import ecocow.movierecapi.entity.productionCompanies.ProductionCompaniesDto;
import ecocow.movierecapi.entity.productionsCountries.ProductionCountriesDto;
import ecocow.movierecapi.entity.spokenLanguages.SpokenLanguagesDto;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class MovieDetailDto implements Serializable {

    private Long movieId;
    private String adultYn;
    private List<CollectionDto> belongsToCollection;
    private Long budget;
    private List<GenreDto> genres;
    private String homepage;
    private String imdbId;
    private List<String> originCountry;
    private String originalLanguage;
    private String originalTitle;
    private String overView;
    private Float popularity;
    private String posterPath;
    private List<ProductionCompaniesDto> productionCompanies;
    private List<ProductionCountriesDto> productionCountries;
    private LocalDate releaseDate;
    private Long revenue;
    private Integer runtime;
    private List<SpokenLanguagesDto> spokenLanguages;
    private String status;
    private String tagline;
    private String title;
    private String videoYn;
    private Float voteAverage;
    private Integer voteCount;

    public void updateMovie(MovieDto movieDto){
        this.movieId = movieDto.getMovieId();
        this.adultYn = movieDto.getAdultYn();
        this.budget = movieDto.getBudget();
        this.homepage = movieDto.getHomepage();
        this.imdbId = movieDto.getImdbId();
        this.originCountry = movieDto.getOriginCountry();
        this.originalLanguage = movieDto.getOriginalLanguage();
        this.originalTitle = movieDto.getOriginalTitle();
        this.overView = movieDto.getOverview();
        this.popularity = movieDto.getPopularity();
        this.posterPath = movieDto.getPosterPath();
        this.releaseDate = movieDto.getReleaseDate();
        this.revenue = movieDto.getRevenue();
        this.runtime = movieDto.getRuntime();
        this.status = movieDto.getStatus();
        this.tagline = movieDto.getTagLine();
        this.title = movieDto.getTitle();
        this.videoYn = movieDto.getVideoYn();
        this.voteAverage = movieDto.getVoteAverage();
        this.voteCount = movieDto.getVoteCount();
    }

}
