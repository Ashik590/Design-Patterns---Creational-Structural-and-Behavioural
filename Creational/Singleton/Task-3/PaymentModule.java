public class PaymentModule {
    private DatabaseConnectionManager dbManager;

    public PaymentModule() {
        dbManager = DatabaseConnectionManager.getInstance();
    }

    public void processPayment(double amount) {
        dbManager.connect();
        dbManager.beginTransaction();
        dbManager.executeQuery("insert payment with amount (" + amount + ")");
        dbManager.closeConnection();
    }
}