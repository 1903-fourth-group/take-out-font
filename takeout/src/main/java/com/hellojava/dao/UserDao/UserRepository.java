package com.hellojava.dao.UserDao;


import com.hellojava.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

<<<<<<< .merge_file_a02792
=======

>>>>>>> .merge_file_a17704
public interface UserRepository extends JpaRepository<User,Integer> {
    User findUserByUserNameAndUserPassword(String userName, String userPassword);
}
