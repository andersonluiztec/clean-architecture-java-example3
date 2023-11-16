package com.bancobv.clean.example.core.usecase.User.interfaces;

import java.util.List;

import com.bancobv.clean.example.core.entity.User;

public interface ListUsers{
    public List<User> execute();
}