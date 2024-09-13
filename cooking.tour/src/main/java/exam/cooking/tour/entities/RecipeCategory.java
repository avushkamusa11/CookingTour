package exam.cooking.tour.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class RecipeCategory extends MainEntity{
    private String name;
    @OneToMany
    private List<Recipe> recipes;
}
