package domain.service;

import adapters.providers.breeds.model.BreedsModel;
import adapters.providers.breeds.model.BreedsResponse;

public interface BreedService {

    BreedsResponse getBreedByFilter(String breedId, String limit, String page);
    BreedsModel getBreedById(String breedId);
    BreedsResponse getBreedsAll();




}
