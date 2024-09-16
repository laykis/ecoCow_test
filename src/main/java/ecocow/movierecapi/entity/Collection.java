package ecocow.movierecapi.entity;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.print.attribute.standard.MediaSize;

@Entity
@Getter
@Table(name = "COLLECTION")
public class Collection extends BaseEntity{

    @Id
    @Column(name = "COLLECTION_ID")
    private Long collectionId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "POSTER_PATH")
    private String posterPath;

    @Column(name = "BACKDROP_PATH")
    private String backdropPath;
}
