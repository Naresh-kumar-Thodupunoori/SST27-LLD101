public interface PaymentProvider {
    String processPayment(double amount);
    String getProviderName();
}
