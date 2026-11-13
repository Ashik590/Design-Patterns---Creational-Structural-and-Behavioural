public class CreditCardAdapter implements PaymentGateway {
    private CreditCardPayment creditCardPayment;

    public CreditCardAdapter() {
        this.creditCardPayment = new CreditCardPayment();
    }

    @Override
    public boolean processPayment() {
        return creditCardPayment.process();
    }
    
}
