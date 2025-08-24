public class CardPaymentProvider implements PaymentProvider {
    @Override
    public String processPayment(double amount) {
        return "Charged card: " + amount;
    }
    
    @Override
    public String getProviderName() {
        return "CARD";
    }
}
