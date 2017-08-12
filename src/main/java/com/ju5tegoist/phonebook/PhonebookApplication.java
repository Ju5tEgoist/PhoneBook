package com.ju5tegoist.phonebook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class PhonebookApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(PhonebookApplication.class, args);
	}

}
