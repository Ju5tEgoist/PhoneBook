package com.ju5tegoist.phonebook.repository;

import com.ju5tegoist.phonebook.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yulia on 16.07.17.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByLogin(String login);
}
