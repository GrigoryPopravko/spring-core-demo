package by.itacademy.service;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FacebookUserServiceImpl implements UserService {
    @Override
    public List<String> getAll() {
        return List.of("Facebook Bob", "Facebook Anna");
    }
}
