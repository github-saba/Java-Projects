interface Operation {
    double apply(double a, double b);
}

public class EnumDemo {

    public static void main(String[] args) {

        System.out.println("1. Basic Enum Usage");
        Day today = Day.MONDAY;
        System.out.println("Today is: " + today);

        System.out.println("\n 2. Enum in Switch");
        switchExample(today);

        System.out.println("\n 3. Enum values(), name(), ordinal()");
        for (Day day : Day.values()) {
            System.out.println(day.name() + " - ordinal: " + day.ordinal());
        }

        System.out.println("\n 4. Enum valueOf()");
        Day d = Day.valueOf("FRIDAY");
        System.out.println("Converted from String: " + d);

        System.out.println("\n 5. Enum with Fields & Constructor");
        System.out.println("Planet EARTH gravity: " + Planet.EARTH.getGravity());

        System.out.println("\n 6. Enum with Custom Method");
        double weight = Planet.EARTH.calculateWeight(70);
        System.out.println("Weight on Earth: " + weight);

        System.out.println("\n 7. Enum Implementing Interface");
        System.out.println("Addition: " + Calculator.ADD.apply(5, 3));
        System.out.println("Multiplication: " + Calculator.MULTIPLY.apply(5, 3));

        System.out.println("\n 8. Enum with Abstract Method (Override per Constant)");
        System.out.println("Coffee price: " + Beverage.COFFEE.getPrice());
        System.out.println("Tea price: " + Beverage.TEA.getPrice());
    }

    // 1. Basic Enum
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void switchExample(Day day) {
        switch (day) {
            case MONDAY:
                System.out.println("Start of week");
                break;
            case FRIDAY:
                System.out.println("Weekend coming!");
                break;
            default:
                System.out.println("Regular day");
        }
    }

    // 5. Enum with Fields & Constructor
    enum Planet {
        MERCURY(3.7),
        EARTH(9.8),
        MARS(3.71);

        private double gravity;

        // Constructor (always private in enum)
        Planet(double gravity) {
            this.gravity = gravity;
        }

        public double getGravity() {
            return gravity;
        }

        public double calculateWeight(double mass) {
            return mass * gravity;
        }
    }

    // 7. Enum Implementing Interface
    enum Calculator implements Operation {
        ADD {
            public double apply(double a, double b) {
                return a + b;
            }
        },
        MULTIPLY {
            public double apply(double a, double b) {
                return a * b;
            }
        }
    }

    // 8. Enum with Abstract Method
    enum Beverage {
        COFFEE {
            double getPrice() { return 120.0; }
        },
        TEA {
            double getPrice() { return 80.0; }
        };

        abstract double getPrice();
    }
}
