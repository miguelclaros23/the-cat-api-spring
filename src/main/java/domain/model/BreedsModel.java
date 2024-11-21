package domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BreedsModel implements Serializable {

    String id;
    String name;
    String temperament;
    String origin;
    String description;

    @Override
    public String toString() {
        return "BreedsModel{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", temperament='" + temperament + '\'' +
                ", origin='" + origin + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BreedsModel that = (BreedsModel) o;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getName(), that.getName()) && Objects.equals(getTemperament(), that.getTemperament()) && Objects.equals(getOrigin(), that.getOrigin()) && Objects.equals(getDescription(), that.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getTemperament(), getOrigin(), getDescription());
    }


}
