package kg.itacademy.demoJdbcSecurity.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Table(name = "jdbc_security_user")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @NonNull
    @Column(name = "login", unique = true)
    String login;

    @Column(name = "password")
    String password;

    @Column(name = "is_active")
    int isActive;


}
