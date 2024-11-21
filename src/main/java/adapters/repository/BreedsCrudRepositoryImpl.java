package adapters.repository;

import domain.model.CrudService;
import domain.port.BreedsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class BreedsCrudRepositoryImpl implements CrudService<BreedEntity> {

    @Autowired
    BreedsCrudRepository breedsCrudRepository;

    /**
     * @param breedEntity
     */
    @Override
    public void create(BreedEntity breedEntity) {
        breedsCrudRepository.save(breedEntity);
    }

    /**
     * @param id
     * @param breedEntity
     */
    @Override
    public void update(String id, BreedEntity breedEntity) {

        BreedEntity breed = breedsCrudRepository.findById(id).orElse(null);
        if(!breed.equals(null)){
            breed.setDescription( breedEntity.getDescription());
            breed.setOrigin( breedEntity.getOrigin());
            breed.setTemperament( breedEntity.getTemperament());
            breed.setName( breedEntity.getName());
            breedsCrudRepository.save(breed);
        }
    }

    /**
     * @param id
     */
    @Override
    public void delete(String id) {
        breedsCrudRepository.deleteById(id);
    }

    /**
     * @return
     */
    @Override
    public Collection<BreedEntity> getItem() {
       return null;
    }

    /**
     * @return
     */
    @Override
    public List<BreedEntity> getAllItems() {
        return breedsCrudRepository.findAll();
    }
}
