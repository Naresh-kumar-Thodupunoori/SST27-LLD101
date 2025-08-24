public class WalletPaymentProvider implements PaymentProvider {
    @Override
    public String processPayment(double amount) {
        return "Wallet debit: " + amount;
    }
    
    @Override
    public String getProviderName() {
        return "WALLET";
    }
}
