package by.itacademy.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacebookUserServiceImpl implements UserService {
    @Override
    public List<String> getAll() {
        return List.of("Facebook Bob", "Facebook Anna");
    }
}
