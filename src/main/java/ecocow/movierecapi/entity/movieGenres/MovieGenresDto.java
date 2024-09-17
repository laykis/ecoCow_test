package ecocow.movierecapi.entity.movieGenres;

import ecocow.movierecapi.entity.base.BaseDto;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MovieGenresDto extends BaseDto implements Serializable {
    private Long movieGenreId;
    private Long movieId;
    private Long genreId;

    public MovieGenres toEntity(){
        return MovieGenres.builder()
                .movieGenreId(this.movieGenreId)
                .movieId(this.movieId)
                .genreId(this.genreId)
                .regDate(this.getRegDate())
                .updDate(this.getUpdDate())
                .build();
    }
}