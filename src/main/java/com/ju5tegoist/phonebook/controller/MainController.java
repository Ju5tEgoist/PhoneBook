package com.ju5tegoist.phonebook.controller;

import com.ju5tegoist.phonebook.PropertiesContainer;
import com.ju5tegoist.phonebook.model.UserDB;
import com.ju5tegoist.phonebook.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by yulia on 12.07.17.
 */
@Controller
public class MainController {
    @Autowired
    private UserRepository userRepository;
//    @Autowired
//    private ContactRepository contactRepository;

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registrationView(Model model) {
        model.addAttribute("userForm", new UserDB());
        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registrationSubmit(@ModelAttribute("userForm") UserDB userDB, Model model, HttpServletRequest request) {
        System.out.println(userDB.getFullName() + "   " + userDB.getPassword() + " " + userDB.getLogin());

        userRepository.save(userDB);
        model.addAttribute("message", PropertiesContainer.MESSAGE_AFTER_REGISTRATION);
        model.addAttribute("userName", userDB.getLogin());

//        Contact contact = new Contact();
//        contact.setFirstName("David");
//        contact.setLastName("Heselhoff");
//        contact.setNameAfterLast("Vasylovich");
//        contact.setMobilePhone("1234567890");
//        contact.setHomePhone("0987654321");
//        contact.setAddress("LaLaLand, 1");
//        contact.setEmail("dheselhoff@fmail.com");
//        contact.setUser(userRepository.findByLogin(user.getLogin()).get(0));
//        contactRepository.save(contact);

        UserDB withContacts = userRepository.findByLogin(userDB.getLogin()).get(0);
        return "login";
    }

    @RequestMapping(value = "/userMainPage", method = RequestMethod.GET)
    public String userMainPageGet(){
        return "userMainPage";
    }

    @RequestMapping(value = "/userMainPage", method = RequestMethod.POST)
    public String userMainPage(){
        return "redirect:/welcome";
    }

    @RequestMapping(value = "/createContact", method = RequestMethod.GET)
    public String createContact(){
        return "createContact";
    }
    @RequestMapping(value = "/createContact", method = RequestMethod.POST)
    public String createContactPost(){
        return "createContact";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginGet(){
        return "login";
    }
}
