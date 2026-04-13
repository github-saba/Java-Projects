/* Builder Pattern (creational) - The Vibe: "Customizing your order at a burger joint."
When a class has 10+ optional fields, a constructor becomes a nightmare.
The Builder lets you "stack" the features you want and then call build(). */

public class House {
    // Only includes what you actually asked for
    public House(HouseBuilder builder) {
        this.hasPool = builder.hasPool;
        this.hasGarden = builder.hasGarden;
    }
}
// Usage: new HouseBuilder().addPool().addGarden().build();
