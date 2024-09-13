package exam.cooking.tour.repositories;

import exam.cooking.tour.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {
}
