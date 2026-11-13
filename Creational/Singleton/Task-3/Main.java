
public class Main {
    public static void main(String[] args) {
        CustomerModule customerModule = new CustomerModule();
        OrderModule orderModule = new OrderModule();
        InventoryModule inventoryModule = new InventoryModule();
        PaymentModule paymentModule = new PaymentModule();

        customerModule.createCustomer("Ashik");
        customerModule.searchCustomer("Ashik");

        orderModule.createOrder(101);
        orderModule.updateOrderStatus(101, "Shipped");

        inventoryModule.updateStock("Java Book", 50);

        paymentModule.processPayment(499.99);
    }
}