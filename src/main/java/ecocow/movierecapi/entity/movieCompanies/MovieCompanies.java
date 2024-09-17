package ecocow.movierecapi.entity.movieCompanies;

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
@Getter
@Table(name = "MOVIE_COMPANIES")
public class MovieCompanies extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "MOVIE_COMPANY_ID")
    private Long movieCompanyId;

    @Column(name = "MOVIE_ID")
    private Long movieId;

    @Column(name = "COMPANY_ID")
    private Long companyId;

    public MovieCompaniesDto toDto() {

        MovieCompaniesDto dto = new MovieCompaniesDto();
        dto.setMovieCompanyId(this.movieCompanyId);
        dto.setMovieId(this.movieId);
        dto.setCompanyId(this.companyId);
        dto.setRegDate(this.getRegDate());
        dto.setUpdDate(this.getUpdDate());
        return dto;
    }

}
