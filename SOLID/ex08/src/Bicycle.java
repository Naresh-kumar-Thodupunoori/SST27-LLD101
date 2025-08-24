public class Bicycle implements Vehicle, PedalVehicle {
    public void move() { 
        System.out.println("Bicycle is moving"); 
    }
    
    public void pedal(int effort) { 
        System.out.println("Pedal effort " + effort); 
    }
}