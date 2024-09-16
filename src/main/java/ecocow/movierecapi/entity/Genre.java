package ecocow.movierecapi.entity;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GENRE")
@Getter
public class Genre extends BaseEntity {

    @Id
    private Long gid;



}
