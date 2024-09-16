package ecocow.movierecapi.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SPOKEN_LANGUAGES")
public class SpokenLanguages extends BaseEntity{

    @Id
    private Long langId;
}
