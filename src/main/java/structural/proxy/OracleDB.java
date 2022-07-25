package structural.proxy;

public class OracleDB implements DatabaseCrudOperations {
    @Override
    public void create() {
        System.out.println("Oracle DB create...");
    }

    @Override
    public void read() {
        System.out.println("Oracle DB read...");
    }

    @Override
    public void update() {
        System.out.println("Oracle DB update...");
    }

    @Override
    public void delete() {
        System.out.println("Oracle DB delete...");
    }
}
