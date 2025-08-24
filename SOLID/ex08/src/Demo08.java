public class Demo08 {
    public static void main(String[] args) {
        Vehicle bicycle = new Bicycle();
        bicycle.move(); 

        PedalVehicle pedalBike = (PedalVehicle) bicycle;
        pedalBike.pedal(5);
        
        Vehicle car = new Car();
        car.move(); 
        
        EngineVehicle engineCar = (EngineVehicle) car;
        engineCar.startEngine();
        car.move(); 
        
        Vehicle eBike = new ElectricBicycle();
        eBike.move();
        
        PedalVehicle pedalEBike = (PedalVehicle) eBike;
        pedalEBike.pedal(3);
        
        RechargeableVehicle rechargeableEBike = (RechargeableVehicle) eBike;
        System.out.println("Battery level: " + rechargeableEBike.getBatteryLevel() + "%");
        rechargeableEBike.recharge(20);
    }
}
