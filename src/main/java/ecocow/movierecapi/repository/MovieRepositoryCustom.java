package ecocow.movierecapi.repository;

import ecocow.movierecapi.entity.movie.MovieDto;

import java.util.List;

public interface MovieRepositoryCustom {

    List<MovieDto> findTopRatedMoviesByGenres(List<Long> genreIds);
}
