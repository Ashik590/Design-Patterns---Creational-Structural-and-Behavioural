public class CheckoutService {
    private PaymentGateway paymentGateway;

    public CheckoutService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void checkout() {
        boolean paymentSuccess = paymentGateway.processPayment();

        if (paymentSuccess) {
            System.out.println("Payment successful. Proceeding with checkout.");
        } else {
            System.out.println("Payment failed. Please try again.");
        }
    }
}
