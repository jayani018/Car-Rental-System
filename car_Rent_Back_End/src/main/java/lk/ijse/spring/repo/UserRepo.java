package lk.ijse.spring.repo;

import lk.ijse.spring.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @author : Jayani_Arunika  10/30/2023 - 11:48 PM
 * @since : v0.01.0
 **/

public interface UserRepo extends JpaRepository<User,String> {
    @Query(value = "select * from User where userName=? AND password=? limit 1",nativeQuery = true)
    User findUserByUser_NameAndPassword(String username, String password) throws RuntimeException;

}
