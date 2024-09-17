package ecocow.movierecapi.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class MovieRecDto implements Serializable {

    private Long movieId;
    private String title;
    private String adultYn;
    private String posterPath;
}
