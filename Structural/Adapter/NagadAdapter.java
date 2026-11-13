public class NagadAdapter implements PaymentGateway {
    private NagadPayment nagadPayment;

    public NagadAdapter() {
        this.nagadPayment = new NagadPayment();
    }

    @Override
    public boolean processPayment() {
        return nagadPayment.executePayment();
    }
    
}
