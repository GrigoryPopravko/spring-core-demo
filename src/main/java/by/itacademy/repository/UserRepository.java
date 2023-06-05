package by.itacademy.repository;

import by.itacademy.connection.ConnectionPool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserRepository implements MyRepository {

    private ConnectionPool connectionPool;

    @Autowired
    public UserRepository(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }

    public UserRepository() {
    }

    public List<String> findAll() {
        return List.of("Bob", "Anna");
    }
}
