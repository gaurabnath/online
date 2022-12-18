package com.domai.demo.online.cinema.system.service;


import com.domai.demo.online.cinema.system.data.entity.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
