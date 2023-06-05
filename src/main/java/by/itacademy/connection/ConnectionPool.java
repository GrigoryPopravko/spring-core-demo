package by.itacademy.connection;

public class ConnectionPool {

    private final String driver;
    private final Integer poolSize;
    private final String url;
    private final String username;
    private final String password;

    public ConnectionPool(
            String driver,
            Integer poolSize,
            String url,
            String username,
            String password) {
        this.driver = driver;
        this.poolSize = poolSize;
        this.url = url;
        this.username = username;
        this.password = password;
    }
}
