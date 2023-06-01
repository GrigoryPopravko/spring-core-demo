package by.itacademy;

import by.itacademy.controller.UserController;
import by.itacademy.service.UserService;
import by.itacademy.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        UserController userController = context.getBean(UserController.class);
        System.out.println();;
    }
}