package com.example.springsecurityoauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.builders.WebSecurity;

@SpringBootApplication
public class SpringSecurityOauth2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityOauth2Application.class, args);
	}

}
