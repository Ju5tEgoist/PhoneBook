package com.ju5tegoist.phonebook.service;

//import com.ju5tegoist.phonebook.entity.User;

import com.ju5tegoist.phonebook.entity.User;

/**
 * Created by yulia on 16.07.17.
 */
public interface UserService {
    void save(User user);
    User getUser(String login);
}
