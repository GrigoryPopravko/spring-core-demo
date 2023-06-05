package by.itacademy;

import by.itacademy.config.ApplicationConfig;
import by.itacademy.controller.UserController;
import by.itacademy.repository.UserRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        UserController userController = context.getBean(UserController.class);
        System.out.println();
    }
}