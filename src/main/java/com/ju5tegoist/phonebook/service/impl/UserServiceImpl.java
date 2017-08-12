package com.ju5tegoist.phonebook.service.impl;

import com.ju5tegoist.phonebook.entity.User;
import com.ju5tegoist.phonebook.repository.UserRepository;
import com.ju5tegoist.phonebook.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by yulia on 16.07.17.
 */
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;
//
    @Override
    public void save(User userDB) {
        repository.save(userDB);
    }

    // This method provides opportunity to check if user with
    // input login exist in database. If login exist and input password is correct than
    // spring security provides access for user to phonebook
    @Override
    public User getUser(String login) {
        User user = new User();
        List<User> password = repository.findByLogin(login);
        user.setLogin(login);
        user.setPassword(password.get(0).getPassword());
        return user;
    }


}
