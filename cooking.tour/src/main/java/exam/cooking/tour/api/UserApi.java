package exam.cooking.tour.api;

import exam.cooking.tour.dto.CreateUserDto;
import exam.cooking.tour.dto.UserDto;
import exam.cooking.tour.services.UserService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserApi {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserDto> getUsers(){
        return userService.getAll();
    }

    @PostMapping("/create")
    public void createUser(@RequestBody CreateUserDto createUserDto){
        userService.save(createUserDto);
    }

    @GetMapping("/{userId}")
    public UserDto get(@PathVariable(name = "userId") Long userId){
        return userService.getBy(userId);
    }
}
