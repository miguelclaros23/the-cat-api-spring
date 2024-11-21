package adapters.providers.breeds;

import adapters.providers.breeds.model.BreedsModel;
import adapters.providers.breeds.model.BreedsResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BreedsImpl implements BreedsHttpClient {

    private final BreedsHttpClient breedsHttpClient;
    /**
     * @param breedId
     * @return
     */
    @Override
    public BreedsModel getBreedById(String breedId) {
        BreedsModel breedsResponse = breedsHttpClient.getBreedById(breedId);
        if(breedsResponse == null) {
            throw new BreedsException("Unable to get Breed information");
        }
        return breedsResponse;
    }

    /**
     * @return
     */
    @Override
    public BreedsResponse getBreedsAll() {
        BreedsResponse breedsResponse = breedsHttpClient.getBreedsAll();
        if(breedsResponse == null) {
            throw new BreedsException("Unable to get Breeds information all");
        }
        return breedsResponse;
    }

    /**
     * @param breedId
     * @param limit
     * @param page
     * @return
     */
    @Override
    public BreedsResponse getBreedByFilter(String breedId, String limit, String page) {
        BreedsResponse breedsResponse = breedsHttpClient.getBreedByFilter(breedId, limit,page);
        if(breedsResponse == null) {
            throw new BreedsException("Unable to get Breed information filter");
        }
        return breedsResponse;
    }
}
