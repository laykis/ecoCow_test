package ecocow.movierecapi.entity;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
public class Genre extends BaseEntity {

    @Id
    private Long gid;

}
