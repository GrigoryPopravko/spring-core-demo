package by.itacademy.controller;

import by.itacademy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(@Qualifier("simpleUserService") UserService userService) {
        this.userService = userService;
    }

    public void doGet() {
        System.out.println(userService.getAll());
    }
}
