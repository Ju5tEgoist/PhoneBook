package com.ju5tegoist.phonebook.config;

import com.ju5tegoist.phonebook.PhonebookApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by yulia on 11.07.17.
 */
public class PhoneBookServletConfiguration extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(PhonebookApplication.class);
    }
}
