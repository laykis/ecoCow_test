package ecocow.movierecapi.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SpokenLanguages extends BaseEntity{

    @Id
    private Long langId;
}
