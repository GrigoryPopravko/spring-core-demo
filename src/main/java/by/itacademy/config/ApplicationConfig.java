package by.itacademy.config;

import by.itacademy.connection.ConnectionPool;
import by.itacademy.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Random;

@Configuration
@PropertySource(value = "classpath:application.properties")
@ComponentScan(basePackages = "by.itacademy")
public class ApplicationConfig {

    @Bean
    protected ConnectionPool connectionPool(
            @Value("${db.driver}") String driver,
            @Value("${db.poolSize}") Integer poolSize,
            @Value("${db.url}") String url,
            @Value("${db.username}") String username,
            @Value("#{'${app.profile}' == 'prod'? '${db.password}' : 'test'}") String password,
            @Value("#{ new by.itacademy.repository.CompanyRepository() }") CompanyRepository test) {

        return new ConnectionPool(driver, poolSize, url, username, password);
    }
}
