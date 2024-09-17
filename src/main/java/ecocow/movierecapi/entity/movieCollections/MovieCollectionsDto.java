package ecocow.movierecapi.entity.movieCollections;

import ecocow.movierecapi.entity.base.BaseDto;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MovieCollectionsDto extends BaseDto implements Serializable {
    private Long movieColId;
    private Long movieId;
    private Long collectionId;

    public MovieCollections toEntity() {
        return MovieCollections.builder()
                .movieColId(this.movieColId)
                .movieId(this.movieId)
                .collectionId(this.collectionId)
                .regDate(this.getRegDate())
                .updDate(this.getUpdDate())
                .build();
    }
}