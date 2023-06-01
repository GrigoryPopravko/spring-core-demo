package by.itacademy;

public class ConnectionPool {

    public ConnectionPool(String driver, Integer poolSize, String url, String username, String password) {
        this.driver = driver;
        this.poolSize = poolSize;
        this.url = url;
        this.username = username;
        this.password = password;
    }

    private String driver;
    private Integer poolSize;
    private String url;
    private String username;
    private String password;
}
