public class CustomerModule {
    private DatabaseConnectionManager dbManager;

    public CustomerModule() {
        dbManager = DatabaseConnectionManager.getInstance();
    }

    public void createCustomer(String name) {
        dbManager.connect();
        dbManager.executeQuery("Create customer named " + name);
        dbManager.closeConnection();
    }

    public void searchCustomer(String name) {
        dbManager.connect();
        dbManager.executeQuery("Search customer named " + name);
        dbManager.closeConnection();
    }
}