/* Decorator Pattern (Structuaral) - The Vibe: "Adding toppings to a pizza."
It lets you wrap an object inside another object to add functionality
without changing the original class's code. */

public class ExtraCheeseDecorator extends PizzaDecorator {
    public ExtraCheeseDecorator(Pizza p) { super(p); }

    public int getPrice() {
        return basePizza.getPrice() + 2; // Adds $2 to whatever the base was
    }
}
