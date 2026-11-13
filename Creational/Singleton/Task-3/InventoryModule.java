public class InventoryModule {
    private DatabaseConnectionManager dbManager;

    public InventoryModule() {
        dbManager = DatabaseConnectionManager.getInstance();
    }

    public void updateStock(String productName, int quantity) {
        dbManager.connect();
        dbManager.executeQuery(
                "Update quantity (" + quantity + ") where product_name = '" + productName + "'"
        );
        dbManager.closeConnection();
    }
}