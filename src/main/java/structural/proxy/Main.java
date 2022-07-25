package structural.proxy;

public class Main {
    public static void main(String[] args) {
        DatabaseClient databaseClient = new DatabaseClient("oracle", "password");
        DatabaseClient databaseAccessDeniedClient = new DatabaseClient("mysql", "password");

        OracleProxy proxy = new OracleProxy(databaseClient);
        proxy.create();
        proxy.read();
        proxy.update();
        proxy.delete();

        proxy = new OracleProxy(databaseAccessDeniedClient);
        proxy.create();
        proxy.read();
        proxy.update();
        proxy.delete();
    }
}
