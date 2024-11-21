package handler.rest;

import adapters.providers.breeds.model.BreedsModel;
import adapters.providers.breeds.model.BreedsResponse;
import domain.service.BreedService;
import domain.service.BreedServiceImpl;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("breeds")
public class BreedController {

    private final BreedService breedService;
    Logger logger = LoggerFactory.getLogger(BreedServiceImpl.class);

    @GetMapping(value = "/{breedId}")
    public ResponseEntity<BreedsModel> getBreedById(@PathVariable final String breedId) {
        logger.debug("-> Returns a request by id.");
        BreedsModel response = breedService.getBreedById(breedId);
        if(response == null ){
            logger.debug("-> Empty list of requests: {}", breedId);
            return ResponseEntity.ok(new BreedsModel());
        }
        return ResponseEntity.ok(response);
    }

    @GetMapping(value = "/filter/{breedId}/{limit}/{page}")
    public ResponseEntity<BreedsResponse> getBreedByFilter(@PathVariable final String breedId,
                                                              @PathVariable final String limit,
                                                              @PathVariable final String page) {
        logger.debug("-> Returns a request by id.");
        BreedsResponse response = breedService.getBreedByFilter(breedId,limit,page);
        if(response == null ){
            logger.debug("-> Empty list of requests: {} {} {}", breedId,limit,page);
            return ResponseEntity.ok(new BreedsResponse(null));
        }
        return ResponseEntity.ok(response);
    }

    @GetMapping(value = "/all")
    public ResponseEntity<BreedsResponse> getBreedsAll() {
        logger.debug("-> Returns a request by id.");
        BreedsResponse response = breedService.getBreedsAll();
        if(response == null ){
            logger.debug("-> Empty list of requests: {}");
            return ResponseEntity.ok(new BreedsResponse());
        }
        return ResponseEntity.ok(response);
    }
}
