/* A single, easy-to-understand Java example that demonstrates 
Inheritance and also touches all core OOP ideas that usually come up together with it:
IS-A relationship, method overriding, super, access modifiers, runtime polymorphism.*/

Inheritance	-> Developer extends Employee
IS-A Relationship	-> Developer IS-A Employee
Method Overriding	-> calculateSalary()
super keyword	-> Calling parent constructor
Access Modifiers	-> protected, private, public
Runtime Polymorphism	-> Employee emp = new Developer(...)

Interview One-Liners You Can Say
Inheritance allows code reusability and represents IS-A relationships.
Method overriding enables runtime polymorphism.
super is used to access parent class members.
Parent reference holding child object decides method call at runtime. */

public class InheritanceDemo {

    public static void main(String[] args) {

        // Parent reference, Child object
        Employee emp = new Developer(101, "Arjun", 50000, 10000);

        emp.displayDetails();

        // Runtime method call
        System.out.println("Total Salary: " + emp.calculateSalary());
    }
}

// Parent class
class Employee {

    protected int id;
    protected String name;
    protected double salary;

    // Constructor
    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to be overridden
    public double calculateSalary() {
        return salary;
    }

    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + salary);
    }
}

// Child class inherits Employee - Child Class (Inheritance + Overriding)
class Developer extends Employee {

    private double bonus;

    // Constructor using super
    Developer(int id, String name, double salary, double bonus) {
        super(id, name, salary); // calling parent constructor
        this.bonus = bonus;
    }

    // Method Overriding (Runtime Polymorphism)
    @Override
    public double calculateSalary() {
        return salary + bonus;
    }

    public void displayBonus() {
        System.out.println("Bonus: " + bonus);
    }
}
