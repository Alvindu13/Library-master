package com.library.dao.repository;

import com.library.dao.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {


    User findUserByMail(String mail);

    User findUserByUsername(String username);


}
