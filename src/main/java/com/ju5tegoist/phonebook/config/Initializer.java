package com.ju5tegoist.phonebook.config;

import org.springframework.security.access.SecurityConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

///**
// * Created by yulia on 10.08.17.
// */
//public class Initializer implements WebApplicationInitializer {
//
//   // private static final String DISPATCHER_SERVLET_NAME = "dispatcher";
//
//    @Override
//    public void onStartup(ServletContext servletContext) throws ServletException {
//        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
//        // регистрация конфигураций в Spring контексте
//        ctx.register(WebConfig.class);
//        ctx.register(WebSecurityConfig.class);
//        servletContext.addListener(new ContextLoaderListener(ctx));
//
////        ctx.setServletContext(servletContext);
////    ServletRegistration.Dynamic servlet = servletContext.addServlet(DISPATCHER_SERVLET_NAME, new DispatcherServlet(ctx));
////        servlet.addMapping("/")
////    ;
////        servlet.setLoadOnStartup(1);
//    }
//}
