package com.ju5tegoist.phonebook.repository;

import com.ju5tegoist.phonebook.model.UserDB;
import com.ju5tegoist.phonebook.model.UserDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yulia on 16.07.17.
 */
@Repository
public interface UserRepository extends JpaRepository<UserDB, Long> {
    List<UserDB> findByLogin(String login);
}
