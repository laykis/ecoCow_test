package ecocow.movierecapi.entity.movieLanguages;

import ecocow.movierecapi.entity.base.BaseDto;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MovieLanguagesDto extends BaseDto implements Serializable {
    private Long movieLangId;
    private Long movieId;
    private Long langId;

    public MovieLanguages toEntity() {
        return MovieLanguages.builder()
                .movieLangId(this.movieLangId)
                .movieId(this.movieId)
                .langId(this.langId)
                .build();
    }
}