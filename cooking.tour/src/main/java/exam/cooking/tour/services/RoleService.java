package exam.cooking.tour.services;

import exam.cooking.tour.entities.Role;

public interface RoleService {
    Role get(Long id);
    Role save(String roleName);
}
