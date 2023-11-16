package com.bancobv.clean.example.core.usecase.User;

import java.util.List;

import com.bancobv.clean.example.core.entity.User;
import com.bancobv.clean.example.core.usecase.User.interfaces.ListUsers;
import com.bancobv.clean.example.dataproviders.interfaces.UserRepository;

public class ListUsersImpl implements ListUsers{

    private UserRepository userRepository;

    public ListUsersImpl(UserRepository userRepository)
    {
        this.userRepository = userRepository; 
    }

    public List<User> execute() {
        return userRepository.getAll();
    }
    
}
