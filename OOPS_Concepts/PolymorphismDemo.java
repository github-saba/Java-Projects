package OOPS_Concepts;

/* A compact but complete Java example that covers ALL polymorphism features you’re expected to know (especially for interviews):
  Compile-time polymorphism (Method Overloading), Runtime polymorphism (Method Overriding), Upcasting, Dynamic Method Dispatch, instanceof (safe downcasting) 
  
The following Polymorphism Features Covered:
    Compile-time Polymorphism	 -> area(double r)
    Method Overloading	-> Same method name, different parameters
    Runtime Polymorphism	-> Overridden area()
    Method Overriding	-> Child classes redefine parent method
    Upcasting	-> Shape s1 = new Circle(5)
    Dynamic Method Dispatch	-> JVM decides method at runtime
    Downcasting	-> (Circle) s1
    instanceof	-> Safe casting check 

Interview-Ready One-Liners: 
  Polymorphism allows one interface with multiple implementations. 
  Overloading is compile-time, overriding is runtime polymorphism.
  Method calls are resolved at runtime using dynamic dispatch.
  Parent reference + child object enables runtime polymorphism.
*/

//Main Class (Polymorphism in Action)
public class PolymorphismDemo {

    public static void main(String[] args) {

        // Runtime Polymorphism (Upcasting)
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(4, 6);

        System.out.println("Circle Area: " + s1.area());
        System.out.println("Rectangle Area: " + s2.area());

        // Compile-time Polymorphism (Method Overloading)
        Circle c = new Circle(3);
        System.out.println("Overloaded Area Method: " + c.area(7));

        // Downcasting with instanceof
        if (s1 instanceof Circle) {
            Circle circle = (Circle) s1;
            System.out.println("Downcasted Circle Area: " + circle.area());
        }
    }
}

// Parent Class
class Shape {

    // Method to be overridden (Runtime Polymorphism)
    public double area() {
        return 0;
    }

    public void draw() {
        System.out.println("Drawing a shape");
    }
}

// Child Class 1
class Circle extends Shape {

    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    // Method Overriding
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    // Method Overloading (Compile-time Polymorphism)
    public double area(double r) {
        return Math.PI * r * r;
    }
}

// Child Class 2
class Rectangle extends Shape {

    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method Overriding
    @Override
    public double area() {
        return length * width;
    }
}



