public class OrderService {
    private ITaxCalculator taxCalculator;
    private EmailClient email;

    public OrderService() {
        this.taxCalculator = new TaxCalculator(0.18);
        this.email = new EmailClient();
    }

    public OrderService(ITaxCalculator taxCalculator, EmailClient email) {
        this.taxCalculator = taxCalculator;
        this.email = email;
    }

    void checkout(String customerEmail, double subtotal) {
        double total = taxCalculator.calculateTotalWithTax(subtotal);
        email.send(customerEmail, "Thanks! Your total is " + total);
        System.out.println("Order stored (pretend DB).");
    }
}