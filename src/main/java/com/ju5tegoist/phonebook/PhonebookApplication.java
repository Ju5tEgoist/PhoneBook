package com.ju5tegoist.phonebook;

import com.ju5tegoist.phonebook.config.PhoneBookServletConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class PhonebookApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(PhonebookApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(PhonebookApplication.class, args);
	}

}
