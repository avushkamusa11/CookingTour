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
public class Recipe extends MainEntity{
    private String name;
    @ManyToOne
    private RecipeCategory recipeCategory;
    @OneToMany
    private List<RecipeProduct> recipeProduct;
    private String description;
    @ManyToOne
    private User user;
}
