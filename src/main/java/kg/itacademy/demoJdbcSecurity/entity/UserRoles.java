package kg.itacademy.demoJdbcSecurity.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Table(name = "jdbc_security_user_roles")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserRoles {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name = "role_name",unique = true)
    String roleName;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;
}
