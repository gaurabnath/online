package com.domai.demo.online.cinema.system.data.repository;


import com.domai.demo.online.cinema.system.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
        User findByUsername(String username);
}
