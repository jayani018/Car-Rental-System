package lk.ijse.spring.repo;

import lk.ijse.spring.dto.UserRegiDTO;
import lk.ijse.spring.entity.User;
import lk.ijse.spring.entity.UserRegi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @author : Jayani_Arunika  10/29/2023 - 12:01 AM
 * @since : v0.01.0
 **/

public interface UserRegiRepo extends JpaRepository<UserRegi,String> {
    @Query(value = "SELECT userId FROM UserRegi ORDER BY userId DESC LIMIT 1", nativeQuery = true)
    String getLastIndex();

    @Query(value = "SELECT COUNT(userID) FROM UserRegi", nativeQuery = true)
    int getSumUsers();

    @Query(value = "SELECT userregi.userId,userregi.name,userregi.contactNo,userregi.address,userregi.email,userregi.nic,userregi.licenseNo,userregi.nicImg,userregi.licenseImg  FROM UserRegi JOIN  user u on u.userID = userregi.userID where userName=?1", nativeQuery = true)
    UserRegiDTO availableUser(String userName);
}
