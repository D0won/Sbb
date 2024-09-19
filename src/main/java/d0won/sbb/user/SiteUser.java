package d0won.sbb.user;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class SiteUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true) // 유일한 값 저장할 땐 unique = true
    private String username;

    private String password;

    @Column(unique = true)
    private String email;
}
