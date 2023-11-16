package com.bancobv.clean.example.entrypoints.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bancobv.clean.example.core.usecase.User.ListUsersImpl;
import com.bancobv.clean.example.core.usecase.User.interfaces.ListUsers;
import com.bancobv.clean.example.dataproviders.mockUserRepository;
import com.bancobv.clean.example.dataproviders.interfaces.UserRepository;

@Configuration
@EnableAutoConfiguration
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public UserRepository UserRepository() {
		return new mockUserRepository();
	}

	@Bean
	public ListUsers ListUsers(UserRepository userRepository) {
		return new ListUsersImpl(userRepository);
	}
}
