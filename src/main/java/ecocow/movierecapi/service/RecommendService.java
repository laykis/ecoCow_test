package ecocow.movierecapi.service;

import ecocow.movierecapi.dto.MovieDetailDto;
import ecocow.movierecapi.entity.collection.CollectionDto;
import ecocow.movierecapi.entity.genre.Genre;
import ecocow.movierecapi.entity.genre.GenreDto;
import ecocow.movierecapi.entity.movieCollections.MovieCollections;
import ecocow.movierecapi.entity.movieCollections.MovieCollectionsDto;
import ecocow.movierecapi.entity.movieCompanies.MovieCompanies;
import ecocow.movierecapi.entity.movieCompanies.MovieCompaniesDto;
import ecocow.movierecapi.entity.movieCountries.MovieCountries;
import ecocow.movierecapi.entity.movieCountries.MovieCountriesDto;
import ecocow.movierecapi.entity.movieGenres.MovieGenres;
import ecocow.movierecapi.entity.movieGenres.MovieGenresDto;
import ecocow.movierecapi.entity.movieLanguages.MovieLanguages;
import ecocow.movierecapi.entity.movieLanguages.MovieLanguagesDto;
import ecocow.movierecapi.entity.productionCompanies.ProductionCompaniesDto;
import ecocow.movierecapi.entity.productionsCountries.ProductionCountriesDto;
import ecocow.movierecapi.entity.spokenLanguages.SpokenLanguagesDto;
import ecocow.movierecapi.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RecommendService {

    private final MovieRepository movieRepository;
    private final MovieGenreRepository movieGenreRepository;
    private final MovieCompaniesRepository movieCompaniesRepository;
    private final MovieCountriesRepository movieCountriesRepository;
    private final MovieLanguagesRepository movieLanguagesRepository;
    private final ProductionCompaniesRepository productionCompaniesRepository;
    private final ProductionCountriesRepository productionCountriesRepository;
    private final SpokenLanguagesRepository spokenLanguagesRepository;
    private final GenreRepository genreRepository;
    private final CollectionRepository collectionRepository;
    private final MovieCollectionsRepository movieCollectionsRepository;

    /**
     * 영화 상세 데이터 조회 Service
     * @param movieId: Long
     * @return MovieDetailDto
     */
    public MovieDetailDto getMovieDetails(Long movieId){

        MovieDetailDto movieDetailDto = new MovieDetailDto();

        //Movie Entity update
        movieRepository.findById(movieId).ifPresent(movie -> movieDetailDto.updateMovie(movie.toDto()));

        //Genre Update
        List<MovieGenresDto> movieGenreDtos = movieGenreRepository.findAllByMovieId(movieId)
                .stream()
                .map(MovieGenres::toDto)
                .toList();

        List<GenreDto> genreDtos = new ArrayList<>();

        for(MovieGenresDto movieGenreDto : movieGenreDtos){
            genreDtos.add(genreRepository.findByGenreId(movieGenreDto.getGenreId()).toDto());
        }

        movieDetailDto.setGenres(genreDtos);

        //Collection Update
        List<MovieCollectionsDto> movieCollectionsDtos = movieCollectionsRepository.findAllByMovieId(movieId)
                .stream()
                .map(MovieCollections::toDto)
                .toList();

        List<CollectionDto> collectionDtos = new ArrayList<>();

        for(MovieCollectionsDto movieCollectionsDto : movieCollectionsDtos){
            collectionDtos.add(collectionRepository.findByCollectionId(movieCollectionsDto.getCollectionId()).toDto());
        }

        movieDetailDto.setBelongsToCollection(collectionDtos);

        //ProductionCompanies Update
        List<MovieCompaniesDto> movieCompaniesDtos = movieCompaniesRepository.findAllByMovieId(movieId)
                .stream()
                .map(MovieCompanies::toDto)
                .toList();

        List<ProductionCompaniesDto> productionCompaniesDtos = new ArrayList<>();

        for(MovieCompaniesDto movieCompaniesDto : movieCompaniesDtos){
            productionCompaniesDtos.add(productionCompaniesRepository.findByCompanyId(movieCompaniesDto.getCompanyId()).toDto());
        }

        movieDetailDto.setProductionCompanies(productionCompaniesDtos);

        //ProductionCountries Update
        List<MovieCountriesDto> movieCountriesDtos = movieCountriesRepository.findAllByMovieId(movieId)
                .stream()
                .map(MovieCountries::toDto)
                .toList();

        List<ProductionCountriesDto> productionCountriesDtos = new ArrayList<>();

        for(MovieCountriesDto movieCountriesDto : movieCountriesDtos){
            productionCountriesDtos.add(productionCountriesRepository.findByCountryId(movieCountriesDto.getCountryId()).toDto());
        }

        movieDetailDto.setProductionCountries(productionCountriesDtos);


        //SpokenLanguages Update
        List<MovieLanguagesDto> movieLanguagesDtos = movieLanguagesRepository.findAllByMovieId(movieId)
                .stream()
                .map(MovieLanguages::toDto)
                .toList();

        List<SpokenLanguagesDto> spokenLanguagesDtos = new ArrayList<>();

        for(MovieLanguagesDto movieLanguagesDto : movieLanguagesDtos){
            spokenLanguagesDtos.add(spokenLanguagesRepository.findByLangId(movieLanguagesDto.getLangId()).toDto());
        }

        movieDetailDto.setSpokenLanguages(spokenLanguagesDtos);

        return movieDetailDto;

    }

}
