package structural.proxy;

public class DatabaseClient {

    private String name;

    private String password;

    public DatabaseClient(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
