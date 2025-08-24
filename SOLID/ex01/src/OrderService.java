public class OrderService {
    private ITaxCalculator taxCalculator = new TaxCalculator(0.18);
    private EmailClient email = new EmailClient();

    void checkout(String customerEmail, double subtotal) {
        double total = taxCalculator.calculateTotalWithTax(subtotal);
        email.send(customerEmail, "Thanks! Your total is " + total);
        System.out.println("Order stored (pretend DB).");
    }
}