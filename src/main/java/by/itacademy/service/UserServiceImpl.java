package by.itacademy.service;

import by.itacademy.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("simpleUserService")
public class UserServiceImpl implements UserService {

    private final Repository companyRepository;
    private final List<Repository> repositories;

    @Autowired
    public UserServiceImpl(Repository companyRepository, List<Repository> repositories) {
        this.companyRepository = companyRepository;
        this.repositories = repositories;
    }

    public List<String> getAll() {
        return repositories.get(0).findAll();
    }
}
