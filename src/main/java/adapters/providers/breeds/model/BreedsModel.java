package adapters.providers.breeds.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BreedsModel implements Serializable {

    String id;
    String name;
    String temperament;
    String origin;
    String description;
}
