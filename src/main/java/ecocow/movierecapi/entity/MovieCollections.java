package ecocow.movierecapi.entity;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Table(name = "MOVIE_COLLECTIONS")
public class MovieCollections extends BaseEntity{

    @Id
    @Column(name = "MOVIE_COLLECTION_ID")
    private Long movieColId;

    @Column(name = "MOVIE_ID")
    private Long movieId;

    @Column(name = "COLLECTION_ID")
    private Long collectionId;
}
