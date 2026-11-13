public class StripeAdapter implements PaymentGateway {
    private StripePayment stripePayment;

    public StripeAdapter() {
        this.stripePayment = new StripePayment();
    }

    @Override
    public boolean processPayment() {
        return stripePayment.goPayment();
    }
}