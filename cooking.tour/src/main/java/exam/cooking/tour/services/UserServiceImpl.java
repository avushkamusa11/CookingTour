package exam.cooking.tour.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import exam.cooking.tour.dto.CreateUserDto;
import exam.cooking.tour.dto.UserDto;
import exam.cooking.tour.entities.Role;
import exam.cooking.tour.entities.User;
import exam.cooking.tour.repositories.UserRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private RoleService roleService;


    @Override
    public User save(CreateUserDto userDto) {
        User user = convertCreateUserDtoToUser(userDto);
        Role role = roleService.get(1l);
        Set<Role> roles = new HashSet<>();
        roles.add(role);
        user.setRole(roles);
        return userRepo.save(user);
    }

    @Override
    public UserDto getBy(Long id) {
        Optional<User> user = userRepo.findById(id);
        if(user.isPresent()){
            return convertToDto(user.get());
        }
        return null;
    }

    @Override
    public User getBy(String username) {
        return null;
    }

    @Override
    public User getBy(String firstName, String lastName) {
        return null;
    }

    @Override
    public List<UserDto> getAll() {
       // List<User> users = userRepo.findAll();
        return userRepo.findAll()
                .stream()
                .map(this::convertToDto)
                .toList();

        //return modelMapper. (userRepo.findAll(),UserDto.class) ;
    }

    private UserDto convertToDto(User user){
        UserDto userDto = modelMapper.map(user, UserDto.class);
        Set<String> roles=  user.getRole().stream().map(this::convertRole).collect(Collectors.toSet());
        userDto.setRoleName(roles);
        return userDto;

    }
    private User convertCreateUserDtoToUser(CreateUserDto userDto){
        return modelMapper.map(userDto, User.class);
    }
    private String convertRole(Role role){
        return role.getName();
    }
}
