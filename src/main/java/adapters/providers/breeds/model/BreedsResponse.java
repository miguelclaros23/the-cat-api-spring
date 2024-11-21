package adapters.providers.breeds.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BreedsResponse implements Serializable {

    List<BreedsModel> breedsModels;
}
