package ecocow.movierecapi.entity;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SPOKEN_LANGUAGES")
@Getter
public class SpokenLanguages extends BaseEntity{

    @Id
    @Column(name = "LANG_ID")
    private Long langId;

    @Column(name = "ENGLISH_NAME")
    private String englishName;

    @Column(name = "ISO_639_1")
    private String iso6391;

    @Column(name = "NAME")
    private String name;
}
