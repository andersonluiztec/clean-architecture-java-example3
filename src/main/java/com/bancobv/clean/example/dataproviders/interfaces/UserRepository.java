package com.bancobv.clean.example.dataproviders.interfaces;

import com.bancobv.clean.example.core.entity.User;

import java.util.List;

public interface UserRepository{
    List<User> getAll();
}