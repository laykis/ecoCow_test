package ecocow.movierecapi.repository;

import ecocow.movierecapi.entity.productionsCountries.ProductionCountries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductionCountriesRepository extends JpaRepository<ProductionCountries, Long> {
}
