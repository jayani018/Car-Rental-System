package lk.ijse.spring.repo;

import lk.ijse.spring.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @author : Jayani_Arunika  10/29/2023 - 12:01 AM
 * @since : v0.01.0
 **/

public interface UserRegiRepo extends JpaRepository<User,String> {
    @Query(value = "SELECT userId FROM userregi ORDER BY userId DESC LIMIT 1", nativeQuery = true)
    String getLastIndex();
}
