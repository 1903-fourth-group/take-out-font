package com.hellojava.dao.UserDao;


import com.hellojava.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findUserByUserNameAndUserPassword(String userName, String userPassword);
}
