package ecocow.movierecapi.entity.movieCollections;

import ecocow.movierecapi.entity.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.experimental.SuperBuilder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Table(name = "MOVIE_COLLECTIONS")
public class MovieCollections extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "MOVIE_COLLECTION_ID")
    private Long movieColId;

    @Column(name = "MOVIE_ID")
    private Long movieId;

    @Column(name = "COLLECTION_ID")
    private Long collectionId;

    public MovieCollectionsDto toDto() {
        MovieCollectionsDto dto = new MovieCollectionsDto();

        dto.setMovieId(this.movieId);
        dto.setMovieColId(this.movieColId);
        dto.setCollectionId(this.collectionId);
        dto.setRegDate(this.getRegDate());
        dto.setUpdDate(this.getUpdDate());
        return dto;
    }
}
