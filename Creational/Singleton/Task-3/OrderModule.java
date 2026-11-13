public class OrderModule {
    private DatabaseConnectionManager dbManager;

    public OrderModule() {
        dbManager = DatabaseConnectionManager.getInstance();
    }

    public void createOrder(int orderId) {
        dbManager.connect();
        dbManager.beginTransaction();
        dbManager.executeQuery("insert order with order id (" + orderId + ")");
        dbManager.closeConnection();
    }

    public void updateOrderStatus(int orderId, String status) {
        dbManager.connect();
        dbManager.executeQuery(
                "update order status '" + status + "' where order_id = " + orderId
        );
        dbManager.closeConnection();
    }
}