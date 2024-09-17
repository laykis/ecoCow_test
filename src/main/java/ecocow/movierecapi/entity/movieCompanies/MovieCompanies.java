package ecocow.movierecapi.entity.movieCompanies;

import ecocow.movierecapi.entity.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Table(name = "MOVIE_COMPANIES")
public class MovieCompanies extends BaseEntity {

    @Id
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
