public class ShippingCostCalculator {
    double cost(Shipment s){
        ShippingCalculator calculator = ShipmentManager.getType(s.type);
        return calculator.calculateCost(s);
    }
}
