package adapters.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BreedsCrudRepository extends MongoRepository<BreedEntity, String> {
}
