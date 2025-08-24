public class Car implements Vehicle, EngineVehicle {
    private boolean engineRunning = false;
    
    public void move() { 
        if (engineRunning) {
            System.out.println("Car is driving");
        } else {
            System.out.println("Car cannot move - engine is not running");
        }
    }
    
    public void startEngine() { 
        engineRunning = true;
        System.out.println("Car engine started");
    }
    
    public void stopEngine() { 
        engineRunning = false;
        System.out.println("Car engine stopped");
    }
}
