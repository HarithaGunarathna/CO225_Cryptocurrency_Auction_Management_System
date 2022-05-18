package com.example.demo.User;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    public List<User> getUsers() {
        return List.of(
                new User(
                1,
                "Haritha",
                "0779046741",
                "Haritha123"

        ));
    }
}
