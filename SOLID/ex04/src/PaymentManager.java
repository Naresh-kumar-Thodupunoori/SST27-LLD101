public class PaymentManager {
    public static PaymentProvider createProvider(String providerName) {
        switch (providerName.toUpperCase()) {
            case "CARD":
                return new CardPaymentProvider();
            case "UPI":
                return new UPIPaymentProvider();
            case "WALLET":
                return new WalletPaymentProvider();
            case "NETBANKING":
                return new NetBankingPaymentProvider();
            default:
                throw new RuntimeException("Unsupported payment provider: " + providerName);
        }
    }
}
