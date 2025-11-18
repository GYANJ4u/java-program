// Define the interface
interface Vehicle {
    void speed();
}

// Implementing Car class
class Car implements Vehicle {
    public void speed() {
        System.out.println("The car is moving at 100 km/h.");
    }
}

// Implementing Bike class
class Bike implements Vehicle {
    public void speed() {
        System.out.println("The bike is moving at 60 km/h.");
    }
}

// Main class to test the implementation
public class VehicleTest {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();

        myCar.speed();
        myBike.speed();
    }
}
