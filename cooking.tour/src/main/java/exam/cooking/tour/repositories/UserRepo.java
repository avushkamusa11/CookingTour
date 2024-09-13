package exam.cooking.tour.repositories;

import exam.cooking.tour.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
