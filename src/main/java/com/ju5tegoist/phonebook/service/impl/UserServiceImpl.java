package com.ju5tegoist.phonebook.service.impl;

import com.ju5tegoist.phonebook.entity.User;
import com.ju5tegoist.phonebook.model.UserDB;
import com.ju5tegoist.phonebook.repository.UserRepository;
import com.ju5tegoist.phonebook.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yulia on 16.07.17.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;
//
//    @Override
//    public void save(UserDB userDB) {
//        repository.save(userDB);
//    }

    @Override
    public User getUser(String login) {
        User user = new User();
        user.setLogin(login);
        user.setPassword("1111");
        return user;
    }
}
