package ecocow.movierecapi.controller;

import ecocow.movierecapi.service.MovieService;
import ecocow.movierecapi.entity.movie.MovieDto;
import ecocow.movierecapi.util.response.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import static ecocow.movierecapi.util.C.INVALID_MOVIE_ID;
import static ecocow.movierecapi.util.C.SEARCH_SUCCESS;
import static ecocow.movierecapi.util.TxidGenerator.getTxid;
import static ecocow.movierecapi.util.validation.MovieIdValidator.isValidMovieId;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class MovieController {

    private final MovieService movieService;

    @PostMapping("/movie/detail")
    public ResponseEntity<Response> getMovieDetail(@RequestBody MovieDto movie) {

        String txid = getTxid();

        if(isValidMovieId(movie.getMovieId())) {
            return ResponseEntity.ok(new Response(txid, HttpStatus.OK, SEARCH_SUCCESS, movieService.getMovieDetails(movie.getMovieId())));
        }

        return ResponseEntity.ok(new Response(txid, HttpStatus.BAD_REQUEST, INVALID_MOVIE_ID));
    }

    @PostMapping("/movie/rec")
    public ResponseEntity<Response> getMovieRec(@RequestBody MovieDto movie) {

        String txid = getTxid();

        if(isValidMovieId(movie.getMovieId())) {
            return ResponseEntity.ok(new Response(txid, HttpStatus.OK, SEARCH_SUCCESS, movieService.getRecMovies(movie.getMovieId())));
        }

        return ResponseEntity.ok(new Response(txid, HttpStatus.BAD_REQUEST, INVALID_MOVIE_ID));
    }

}
