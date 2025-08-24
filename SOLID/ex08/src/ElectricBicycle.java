public class ElectricBicycle implements Vehicle, PedalVehicle, RechargeableVehicle {
    private int batteryLevel = 100;
    
    public void move() { 
        if (batteryLevel > 0) {
            System.out.println("Electric bicycle is moving with electric assist");
        } else {
            System.out.println("Electric bicycle is moving with pedal power only");
        }
    }
    
    public void pedal(int effort) { 
        System.out.println("Pedal effort " + effort + " (with electric assist)");
    }
    
    public void recharge(int kWh) { 
        batteryLevel = Math.min(100, batteryLevel + kWh);
        System.out.println("Recharged " + kWh + " kWh. Battery level: " + batteryLevel + "%");
    }
    
    public int getBatteryLevel() { 
        return batteryLevel;
    }
}
