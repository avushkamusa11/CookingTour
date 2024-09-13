package exam.cooking.tour.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class ProductQuantity extends MainEntity{
    private BigDecimal quantity;
    @ManyToOne
    private Product product;
    @OneToOne
    private RecipeProduct recipeProduct;
}
