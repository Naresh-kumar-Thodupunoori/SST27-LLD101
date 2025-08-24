public class ShipmentManager {
    public static ShippingCalculator getType(String type){
        switch(type){
            case "STANDARD":
                return new Standardcalculator();
            case "EXPRESS":
                return new ExpressCalculator();
            case "OVERNIGHT":
                return new OvernightCalculator();
            default:
                throw new IllegalArgumentException("Unknown type: " + type);
        }
    }
}
