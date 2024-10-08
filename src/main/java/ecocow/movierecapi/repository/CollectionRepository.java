package ecocow.movierecapi.repository;

import ecocow.movierecapi.entity.collection.Collection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollectionRepository extends JpaRepository<Collection, Long> {

    Collection findByCollectionId(Long collectionId);
}
