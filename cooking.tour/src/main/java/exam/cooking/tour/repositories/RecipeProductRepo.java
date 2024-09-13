package exam.cooking.tour.repositories;

import exam.cooking.tour.entities.RecipeProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeProductRepo extends JpaRepository<RecipeProduct, Long> {
}
