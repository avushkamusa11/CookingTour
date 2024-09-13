package exam.cooking.tour.services;

import exam.cooking.tour.dto.CreateUserDto;
import exam.cooking.tour.dto.UserDto;
import exam.cooking.tour.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    User save(CreateUserDto userDto);
    UserDto getBy(Long id);
    User getBy(String username);
    User getBy(String firstName, String lastName);
    List<UserDto> getAll();
}
