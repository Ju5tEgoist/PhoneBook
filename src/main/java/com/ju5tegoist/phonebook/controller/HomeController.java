//package com.ju5tegoist.phonebook.controller;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import java.util.Map;
//
///**
// * Created by yulia on 12.07.17.
// */
//@Controller
//public class HomeController {
//    @Value("${welcome.message:test}")
//    private String message = "Hello World";
//
//    @RequestMapping("/")
//    public String welcome(Map<String, Object> model) {
//        model.put("message", this.message);
//        return "welcome";
//    }
//}
