public class PaymentService {
    String pay(Payment p) {
        // Get the right chef for this payment method
        PaymentProvider provider = PaymentManager.createProvider(p.provider);
        // Let the chef handle the payment
        return provider.processPayment(p.amount);
    }
}