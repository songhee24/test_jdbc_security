package kg.itacademy.demoJdbcSecurity.bootstrap;

import kg.itacademy.demoJdbcSecurity.entity.User;
import kg.itacademy.demoJdbcSecurity.entity.UserRoles;
import kg.itacademy.demoJdbcSecurity.repository.UserRepository;
import kg.itacademy.demoJdbcSecurity.repository.UserRolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements CommandLineRunner {
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserRolesRepository userRolesRepository;

    @Override
    public void run(String... args) throws Exception {
             User admin = User.builder()
                     .login("admin")
                     .password(passwordEncoder.encode("123"))
                     .isActive(1)
                     .build();

             User user = User.builder()
                     .login("user")
                     .password(passwordEncoder.encode("456"))
                     .isActive(1)
                     .build();

             UserRoles adminRole = UserRoles.builder()
                     .roleName("ROLE_ADMIN")
                     .user(admin)
                     .build();

             UserRoles userRole = UserRoles.builder()
                     .roleName("ROLE_USER")
                     .user(user)
                     .build();

             userRepository.save(user);
             userRepository.save(admin);
             userRolesRepository.save(adminRole);
             userRolesRepository.save(userRole);
    }
}
