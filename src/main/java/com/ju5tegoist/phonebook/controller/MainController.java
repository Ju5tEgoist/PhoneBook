package com.ju5tegoist.phonebook.controller;

import com.ju5tegoist.phonebook.PropertiesContainer;
import com.ju5tegoist.phonebook.model.Contact;
import com.ju5tegoist.phonebook.model.User;
import com.ju5tegoist.phonebook.repository.ContactRepository;
import com.ju5tegoist.phonebook.repository.UserRepository;
import com.ju5tegoist.phonebook.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * Created by yulia on 12.07.17.
 */
@Controller
public class MainController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ContactRepository contactRepository;

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registrationView(Model model) {
        model.addAttribute("userForm", new User());
        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registrationSubmit(@ModelAttribute("userForm") User user, Model model, HttpServletRequest request) {
        System.out.println(user.getFullName() + "   " + user.getPassword() + " " + user.getLogin());
        try {
            request.login(user.getLogin(),user.getPassword());
        } catch(ServletException e) {
// fail to authenticate
        }
        userRepository.save(user);
        model.addAttribute("message", PropertiesContainer.MESSAGE_AFTER_REGISTRATION);
        model.addAttribute("userName", user.getLogin());

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

        User withContacts = userRepository.findByLogin(user.getLogin()).get(0);
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


//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public String welcomeView() {
//        return "welcome";
//    }






//    @RequestMapping(method = RequestMethod.GET)
//    public String registerGet(){
//        return "registration";
//    }
//
//    @RequestMapping(method = RequestMethod.POST)
//    public String registerPost(HttpServletRequest request){
//        HttpSession session = request.getSession();
//        String userEmail = (String) request.getAttribute("email");
//        session.setAttribute(userEmail, userEmail);
//        return "redirect:/welcome";
//    }
}
