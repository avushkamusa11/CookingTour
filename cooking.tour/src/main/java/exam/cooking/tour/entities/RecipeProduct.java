package exam.cooking.tour.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class RecipeProduct extends MainEntity{
    private Long id;
    @ManyToOne
    private Recipe recipe;
    @OneToMany
    private List<ProductQuantity> productQuantity;

}
