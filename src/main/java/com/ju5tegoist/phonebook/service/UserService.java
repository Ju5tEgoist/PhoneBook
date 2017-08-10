package com.ju5tegoist.phonebook.service;

import com.ju5tegoist.phonebook.entity.User;
//import com.ju5tegoist.phonebook.model.UserDB;

/**
 * Created by yulia on 16.07.17.
 */
public interface UserService {
 //   void save(UserDB user);
    User getUser(String login);
}
