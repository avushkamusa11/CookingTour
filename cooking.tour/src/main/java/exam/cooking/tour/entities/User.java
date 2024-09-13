package exam.cooking.tour.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "USERS")
public class User extends MainEntity{
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    @OneToMany
    private Set<Role> role;
}
