package exam.cooking.tour.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CreateUserDto {
    private String firstName;
    private String lastName;
    private String username;
    private String password;
}
