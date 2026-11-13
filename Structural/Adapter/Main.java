public class Main {
    public static void main(String[] args) {
        PaymentGateway paymentGateway = new StripeAdapter();
        CheckoutService checkoutService = new CheckoutService(paymentGateway);

        checkoutService.checkout();
        System.out.println();
        
        PaymentGateway bkashPaymentGateway = new BkashAdapter();
        CheckoutService bkashCheckoutService = new CheckoutService(bkashPaymentGateway);
        
        bkashCheckoutService.checkout();
        System.out.println();
        
        PaymentGateway creditCardPaymentGateway = new CreditCardAdapter();
        CheckoutService creditCardCheckoutService = new CheckoutService(creditCardPaymentGateway);
        
        creditCardCheckoutService.checkout();
        System.out.println();
        
        PaymentGateway nagadPaymentGateway = new NagadAdapter();
        CheckoutService nagadCheckoutService = new CheckoutService(nagadPaymentGateway);
        
        nagadCheckoutService.checkout();
        System.out.println();
    }
}
