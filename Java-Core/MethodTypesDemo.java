/* A single, simple Java example that shows static, instance, abstract, and factory methods together,
    with clear comments on each method explaining what it does. 
    
    Static method → belongs to class (Vehicle.companyInfo())
    Instance method → belongs to object (vehicle.start())
    Abstract method → forces subclasses to implement (fuelType())
    Factory method → creates objects for you (getVehicle())
*/

// Main class to test everything
public class MethodTypesDemo {

    public static void main(String[] args) {

        // Calling STATIC METHOD
        Vehicle.companyInfo();

        // Using FACTORY METHOD to get an object
        Vehicle vehicle = Vehicle.getVehicle("car");

        // Calling INSTANCE METHOD
        vehicle.start();

        // Calling ABSTRACT METHOD (implemented by subclass)
        vehicle.fuelType();
    }
}

// Abstract class to demonstrate abstract methods
abstract class Vehicle {

    // INSTANCE METHOD
    // Belongs to an object (instance) of the class
    // Can use instance variables
    void start() {
        System.out.println("Vehicle is starting");
    }

    // ABSTRACT METHOD
    // Has no body
    // Must be implemented by subclasses
    abstract void fuelType();

    // STATIC METHOD
    // Belongs to the class, not to objects
    // Can be called without creating an object
    static void companyInfo() {
        System.out.println("Vehicle company: AutoCorp");
    }

    // FACTORY METHOD
    // Creates and returns an object
    // Hides the object creation logic
    static Vehicle getVehicle(String type) {
        if (type.equalsIgnoreCase("car")) {
            return new Car();
        } else if (type.equalsIgnoreCase("bike")) {
            return new Bike();
        }
        return null;
    }
}

// Subclass implementing abstract method
class Car extends Vehicle {

    // Implementation of abstract method
    @Override
    void fuelType() {
        System.out.println("Car uses Petrol or Diesel");
    }
}

class Bike extends Vehicle {

    // Implementation of abstract method
    @Override
    void fuelType() {
        System.out.println("Bike uses Petrol");
    }
}


