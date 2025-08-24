public class OvernightCalculator implements ShippingCalculator {

    @Override
    public double calculateCost(Shipment s){
        double cost = 120 + 10*s.weightKg;
        return cost;
    }
}
