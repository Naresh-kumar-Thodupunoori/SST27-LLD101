public class TaxCalculator implements ITaxCalculator {
    private double taxRate = 0.18;

    public TaxCalculator(double taxRate) {
        this.taxRate = taxRate;
    }
    
    @Override
    public double calculateTax(double subtotal){
        return subtotal * this.taxRate;
    }

    @Override
    public double calculateTotalWithTax(double subtotal){
        return subtotal + calculateTax(subtotal);
    }
}
