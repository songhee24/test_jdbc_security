package kg.itacademy.demoJdbcSecurity.repository;

import kg.itacademy.demoJdbcSecurity.entity.UserRoles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRolesRepository extends JpaRepository<UserRoles,Long> {
}
