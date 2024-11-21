package adapters.providers.breeds;

import adapters.providers.breeds.model.BreedsModel;
import adapters.providers.breeds.model.BreedsResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "thecatapi-http-client", url = "${service.provider.thecatapi.url}")
public interface BreedsHttpClient {

    @GetMapping("breeds/{breedId}")
    BreedsModel getBreedById(@PathVariable final String breedId);

    @GetMapping("breeds?limit=100&page=0")
    BreedsResponse getBreedsAll();

    @GetMapping("images/search/?breed_ids={breedId}&limit={limit}&page={page}")
    BreedsResponse getBreedByFilter(@PathVariable final String breedId,
                                    @PathVariable final String limit,
                                    @PathVariable final String page);

}
