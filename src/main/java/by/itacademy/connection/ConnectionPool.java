package by.itacademy.connection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConnectionPool {

    private final String driver;
    private final Integer poolSize;
    private final String url;
    private final String username;
    private final String password;

    public ConnectionPool(
            @Value("${db.driver}") String driver,
            @Value("${db.poolSize}") Integer poolSize,
            @Value("${db.url}") String url,
            @Value("${db.username}") String username,
            @Value("${db.password}") String password) {
        this.driver = driver;
        this.poolSize = poolSize;
        this.url = url;
        this.username = username;
        this.password = password;
    }
}
