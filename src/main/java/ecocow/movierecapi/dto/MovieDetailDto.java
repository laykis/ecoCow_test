package ecocow.movierecapi.dto;

import ecocow.movierecapi.entity.collection.CollectionDto;
import ecocow.movierecapi.entity.genre.GenreDto;
import ecocow.movierecapi.entity.productionCompanies.ProductionCompaniesDto;
import ecocow.movierecapi.entity.productionsCountries.ProductionCountries;
import ecocow.movierecapi.entity.spokenLanguages.SpokenLanguagesDto;
import lombok.Data;
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
    private List<ProductionCountries> productionCountries;
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

}
