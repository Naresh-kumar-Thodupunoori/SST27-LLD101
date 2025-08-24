public class Standardcalculator implements ShippingCalculator {
    @Override
    public double calculateCost(Shipment s){
        double cost = 50 + 5*s.weightKg;
        return cost;
    }
}
