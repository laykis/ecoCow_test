package ecocow.movierecapi.entity.collection;

import ecocow.movierecapi.entity.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "COLLECTION")
public class Collection extends BaseEntity {

    @Id
    @Column(name = "COLLECTION_ID")
    private Long collectionId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "POSTER_PATH")
    private String posterPath;

    @Column(name = "BACKDROP_PATH")
    private String backdropPath;

    public CollectionDto toDto() {
        CollectionDto dto = new CollectionDto();

        dto.setCollectionId(this.collectionId);
        dto.setName(this.name);
        dto.setPosterPath(this.posterPath);
        dto.setBackdropPath(this.backdropPath);
        dto.setRegDate(this.getRegDate());
        dto.setUpdDate(this.getUpdDate());
        return dto;
    }
}
