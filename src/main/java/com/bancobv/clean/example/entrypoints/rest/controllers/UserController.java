package com.bancobv.clean.example.entrypoints.rest.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bancobv.clean.example.core.entity.User;
import com.bancobv.clean.example.core.usecase.User.interfaces.ListUsers;

@RestController
public class UserController {

    private ListUsers listUsers;

    public UserController(ListUsers listUsers)
    {
        this.listUsers = listUsers;
    }
    
	@GetMapping("/users")
	public List<User> ListUsers(){
		return listUsers.execute();
	}

}
