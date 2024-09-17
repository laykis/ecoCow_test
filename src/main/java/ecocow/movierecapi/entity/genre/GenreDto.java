package ecocow.movierecapi.entity.genre;

import ecocow.movierecapi.entity.base.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GenreDto extends BaseDto implements Serializable {

    private Long genreId;

    private String name;

    public Genre toEntity() {

        return Genre.builder()
                .genreId(this.genreId)
                .name(this.name)
                .regDate(this.getRegDate())
                .updDate(this.getUpdDate())
                .build();
    }
}
