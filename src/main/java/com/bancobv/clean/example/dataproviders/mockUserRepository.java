package com.bancobv.clean.example.dataproviders;

import java.util.ArrayList;
import java.util.List;

import com.bancobv.clean.example.core.entity.User;
import com.bancobv.clean.example.dataproviders.interfaces.UserRepository;

public class mockUserRepository implements UserRepository{

    private List<User> ListUsers;

    public mockUserRepository(){
        ListUsers = new ArrayList<User>();
        ListUsers.add(new User( 1, "Usuário 1"));
        ListUsers.add(new User( 2, "Usuário 2"));
        ListUsers.add(new User( 3, "Usuário 3"));
    }

    @Override
    public List<User> getAll() {
        return ListUsers;
    }
    
}
