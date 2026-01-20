/* A simple Java program that clearly covers Abstraction in OOPS 
   using both abstract class and interface (this is exactly what interviewers expect).
   What Abstraction Means: Hiding implementation details and showing only essential features.
   Achieved using: Abstract class and Interface 

   Abstraction → Hiding implementation, showing functionality
   Abstract class → Can have abstract + non-abstract methods
   Interface → Only abstract methods (before Java 8)*/

// Interface (100% abstraction)
interface Vehicle {
    void start();   // abstract method
}

// Abstract class (partial abstraction)
abstract class Car implements Vehicle {

    // Abstract method
    abstract void fuelType();

    // Concrete method
    void wheels() {
        System.out.println("Car has 4 wheels");
    }
}

// Concrete class (provides implementation)
public class AbstractionExample extends Car {

    @Override
    public void start() {
        System.out.println("Car starts with key or button");
    }

    @Override
    void fuelType() {
        System.out.println("Car runs on petrol or diesel");
    }

    public static void main(String[] args) {

        // Object created using abstraction
        Car car = new AbstractionExample();

        car.start();
        car.fuelType();
        car.wheels();
    }
}
