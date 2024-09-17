package ecocow.movierecapi.repository;

import ecocow.movierecapi.entity.productionCompanies.ProductionCompanies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductionCompaniesRepository extends JpaRepository<ProductionCompanies, Long> {
}
