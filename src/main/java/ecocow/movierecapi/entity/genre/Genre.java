package ecocow.movierecapi.entity.genre;

import ecocow.movierecapi.entity.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.experimental.SuperBuilder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "GENRE")
@Getter
public class Genre extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "GENRE_ID")
    private Long genreId;

    @Column(name = "NAME")
    private String name;

    public GenreDto toDto() {
        GenreDto dto = new GenreDto();
        dto.setGenreId(this.genreId);
        dto.setName(this.name);
        dto.setRegDate(this.getRegDate());
        dto.setUpdDate(this.getUpdDate());

        return dto;
    }

}
