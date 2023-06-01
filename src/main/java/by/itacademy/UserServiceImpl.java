package by.itacademy;

import by.itacademy.annotation.Transactional;

import java.util.List;

@Transactional
public class UserServiceImpl implements UserService {

    public void getAll() {
        System.out.println(List.of("Devils", "Crime & Punishment"));
    }

    public String custom() {
        return "custom";
    }
}
