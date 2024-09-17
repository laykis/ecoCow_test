package ecocow.movierecapi.util.validation;

public class MovieIdValidator {

    public static boolean isValidMovieId(Long movieId){
        return movieId != null && movieId > 0;
    }
}
