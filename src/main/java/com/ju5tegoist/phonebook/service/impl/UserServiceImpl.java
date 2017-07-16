package com.ju5tegoist.phonebook.service.impl;

import com.ju5tegoist.phonebook.model.User;
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

    @Override
    public void save(User user) {
        repository.save(user);
    }
}
