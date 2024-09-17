package ecocow.movierecapi.entity.spokenLanguages;

import ecocow.movierecapi.entity.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.experimental.SuperBuilder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "SPOKEN_LANGUAGES")
@Getter
public class SpokenLanguages extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "LANG_ID")
    private Long langId;

    @Column(name = "ENGLISH_NAME")
    private String englishName;

    @Column(name = "ISO_639_1")
    private String iso6391;

    @Column(name = "NAME")
    private String name;

    public SpokenLanguagesDto toDto() {
        SpokenLanguagesDto dto = new SpokenLanguagesDto();
        dto.setLangId(this.langId);
        dto.setEnglishName(this.englishName);
        dto.setIso6391(this.iso6391);
        dto.setName(this.name);
        dto.setRegDate(this.getRegDate());
        dto.setUpdDate(this.getUpdDate());
        return dto;
    }

}
