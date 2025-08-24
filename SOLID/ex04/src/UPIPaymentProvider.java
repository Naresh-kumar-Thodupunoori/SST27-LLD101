public class UPIPaymentProvider implements PaymentProvider {
    @Override
    public String processPayment(double amount) {
        return "Paid via UPI: " + amount;
    }
    
    @Override
    public String getProviderName() {
        return "UPI";
    }
}
