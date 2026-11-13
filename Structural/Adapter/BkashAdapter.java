public class BkashAdapter implements PaymentGateway {
    private BkashPayment bkashPayment;

    public BkashAdapter() {
        this.bkashPayment = new BkashPayment();
    }

    @Override
    public boolean processPayment() {
        return bkashPayment.doPayment();
    }
    
}
