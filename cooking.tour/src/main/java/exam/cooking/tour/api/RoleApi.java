package exam.cooking.tour.api;

import exam.cooking.tour.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/roles")
public class RoleApi {
    @Autowired
    private RoleService roleService;
    @PostMapping("/create")
    public void create(@RequestParam(name= "roleName")String roleName){
        roleService.save(roleName);
    }

}
