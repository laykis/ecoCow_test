package ecocow.movierecapi.entity.collection;

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
public class CollectionDto extends BaseDto implements Serializable {

    private Long collectionId;

    private String name;

    private String posterPath;

    private String backdropPath;

    public Collection toEntity() {

        return Collection.builder()
                .collectionId(this.collectionId)
                .name(this.name)
                .posterPath(this.posterPath)
                .backdropPath(this.backdropPath)
                .regDate(this.getRegDate())
                .updDate(this.getUpdDate())
                .build();
    }
}
