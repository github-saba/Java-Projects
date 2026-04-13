/* Factory Method Pattern - The Vibe: "I’ll decide what to give you based on what you ask for."
Instead of the client calling new on a specific class, they call a "factory" that decides which object to instantiate.*/ 

public class ShapeFactory {
    public Shape getShape(String type) {
        if (type.equals("CIRCLE")) return new Circle();
        if (type.equals("SQUARE")) return new Square();
        return null;
    }
}
