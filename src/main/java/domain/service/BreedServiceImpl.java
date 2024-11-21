package domain.service;

import adapters.providers.breeds.BreedsHttpClient;
import adapters.providers.breeds.model.BreedsModel;
import adapters.providers.breeds.model.BreedsResponse;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Service
public class BreedServiceImpl implements BreedService {

    Logger logger = LoggerFactory.getLogger(BreedServiceImpl.class);
    private final BreedsHttpClient breedsHttpClient;

    public BreedServiceImpl(BreedsHttpClient breedsHttpClient) {
        this.breedsHttpClient = breedsHttpClient;
    }


    /**
     * @param breedId
     * @param limit
     * @param page
     * @return
     */
    @Override
    public BreedsResponse getBreedByFilter(String breedId, String limit, String page) {
        logger.debug("-> returns the breed according to the selected filter: {}");
        BreedsResponse response = breedsHttpClient.getBreedByFilter(breedId, limit, page);

        return response;
    }

    /**
     * @param breedId
     * @return
     */
    @Override
    public BreedsModel getBreedById(String breedId) {
        logger.debug("-> returns the breed according to the selected id: {}");
        BreedsModel response = breedsHttpClient.getBreedById(breedId);
        return response;
    }

    /**
     * @return
     */
    @Override
    public BreedsResponse getBreedsAll() {
        logger.debug("-> returns the list of available breeds: {}");
        BreedsResponse response = breedsHttpClient.getBreedsAll();
        return response;
    }
}
