package com.domai.demo.online.cinema.system.service;

public interface SecurityService {
    String findLoggedInUsername();

    void autologin(String username, String password);
}
