package structural.proxy;

public class OracleProxy implements DatabaseCrudOperations {

    private final OracleDB oracleDB = new OracleDB();
    private final DatabaseClient databaseClient;

    public OracleProxy(DatabaseClient databaseClient) {
        this.databaseClient = databaseClient;
    }

    @Override
    public void create() {
        if (!checkDatabaseClientAccess()) {
            System.out.println("Access denied");
            return;
        }
        oracleDB.create();
    }

    @Override
    public void read() {
        if (!checkDatabaseClientAccess()) {
            System.out.println("Access denied");
            return;
        }
        oracleDB.read();
    }

    @Override
    public void update() {
        if (!checkDatabaseClientAccess()) {
            System.out.println("Access denied");
            return;
        }
        oracleDB.update();
    }

    @Override
    public void delete() {
        if (!checkDatabaseClientAccess()) {
            System.out.println("Access denied");
            return;
        }
        oracleDB.delete();
    }

    private boolean checkDatabaseClientAccess() {
        return "oracle".equals(databaseClient.getName()) && "password".equals(databaseClient.getPassword());
    }

}
