package exam.cooking.tour.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Product extends MainEntity{
    private String name;
    @ManyToOne
    private ProductCategory productCategory;
}
