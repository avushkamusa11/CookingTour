package exam.cooking.tour.repositories;

import exam.cooking.tour.entities.ProductQuantity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductQuantityRepo extends JpaRepository<ProductQuantity, Long> {
}
