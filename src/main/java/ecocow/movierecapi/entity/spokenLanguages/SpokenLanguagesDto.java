package ecocow.movierecapi.entity.spokenLanguages;

import ecocow.movierecapi.entity.base.BaseDto;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SpokenLanguagesDto extends BaseDto implements Serializable {
    private Long langId;
    private String englishName;
    private String iso6391;
    private String name;

    public SpokenLanguages toEntity() {
        return SpokenLanguages.builder()
                .langId(this.langId)
                .englishName(this.englishName)
                .iso6391(this.iso6391)
                .name(this.name)
                .build();
    }
}