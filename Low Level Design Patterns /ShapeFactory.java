/* Factory Method Pattern (creational) - The Vibe: "I’ll decide what to give you based on what you ask for."
Instead of the client calling new on a specific class, they call a "factory" that decides which object to instantiate.
Defines an interface for creating objects but lets subclasses decide which class to instantiate, promoting loose coupling. */

public class ShapeFactory {
    public static Shape getShape(String type) {
        if (type.equals("CIRCLE")) return new Circle();
        if (type.equals("SQUARE")) return new Square();
        return null;
    }

    public static void main(String args[]) {
        Shape myShape = ShapeFactory.getShape("SQUARE");
        myShape.draw(); /* The code doesn't care it's a circle, it just knows it's a "Shape" */
    }
}

public interface Shape {
    void draw(); // Every shape must implement this method
}

// Implementation 1
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle!");
    }
}

// Implementation 2
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Square!");
    }
}
