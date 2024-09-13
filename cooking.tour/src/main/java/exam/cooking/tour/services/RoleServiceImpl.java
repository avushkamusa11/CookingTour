package exam.cooking.tour.services;

import exam.cooking.tour.entities.Role;
import exam.cooking.tour.repositories.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService{
    @Autowired
    private RoleRepo roleRepo;

    @Override
    public Role get(Long id) {
        Optional<Role> role = roleRepo.findById(id);
        if(role.isPresent()){
            return role.get();
        }
        return null;
    }

    @Override
    public Role save(String roleName) {
        Role role = new Role();
        role.setName(roleName);
        return roleRepo.save(role);
    }
}
