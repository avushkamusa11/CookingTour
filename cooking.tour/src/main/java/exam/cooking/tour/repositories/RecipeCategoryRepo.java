package exam.cooking.tour.repositories;

import exam.cooking.tour.entities.RecipeCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeCategoryRepo extends JpaRepository<RecipeCategory,Long> {
}
