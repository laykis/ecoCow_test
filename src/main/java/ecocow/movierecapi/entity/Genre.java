package ecocow.movierecapi.entity;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GENRE")
@Getter
public class Genre extends BaseEntity {

    @Id
    @Column(name = "GENRE_ID")
    private Long genreId;

    @Column(name = "NAME")
    private String name;


}
