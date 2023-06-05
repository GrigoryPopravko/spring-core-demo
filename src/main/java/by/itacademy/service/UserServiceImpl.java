package by.itacademy.service;

import by.itacademy.repository.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("simpleUserService")
public class UserServiceImpl implements UserService {

    private final MyRepository companyRepository;
    private final List<MyRepository> repositories;

    @Autowired
    public UserServiceImpl(MyRepository companyRepository, List<MyRepository> repositories) {
        this.companyRepository = companyRepository;
        this.repositories = repositories;
    }

    public List<String> getAll() {
        return repositories.get(0).findAll();
    }
}
