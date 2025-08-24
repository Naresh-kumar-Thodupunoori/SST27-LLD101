public class NetBankingPaymentProvider implements PaymentProvider {
    @Override
    public String processPayment(double amount) {
        return "Net Banking transfer: " + amount;
    }
    
    @Override
    public String getProviderName() {
        return "NETBANKING";
    }
}
