package adapters.repository;

import com.mongodb.lang.NonNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

@Data
@Document(collection = "Breed")
public class BreedEntity implements Serializable  {

    @Id
    @NonNull
    private String id;
    private String name;
    private String temperament;
    private String origin;
    private String description;

}
