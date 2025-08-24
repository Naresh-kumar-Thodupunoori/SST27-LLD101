public class ExpressCalculator implements ShippingCalculator {

    @Override
    public double calculateCost(Shipment s){
        double cost = 80 + 8*s.weightKg;
        return cost;
    }
}