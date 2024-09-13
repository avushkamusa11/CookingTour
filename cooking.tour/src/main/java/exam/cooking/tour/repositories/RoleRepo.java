package exam.cooking.tour.repositories;

import exam.cooking.tour.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {
}
