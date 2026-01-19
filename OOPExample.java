/* A simple and complete Java example that covers: Class, Object, Constructor, Getters & Setters, Access Modifiers (private, default, protected, public). Easy to understand and interview-ready */

// Main class
public class OOPExample {

    public static void main(String[] args) {

        // Creating object using constructor
        Employee emp = new Employee(101, "John", 50000);

        // Accessing public method
        emp.displayInfo();

        // Using getters and setters
        emp.setSalary(55000);
        System.out.println("Updated Salary: " + emp.getSalary());

        // Accessing public variable
        System.out.println("Company Name: " + emp.companyName);
    }
}

// Another class in same package
class Employee {

    // =========================
    // Variables with scope
    // =========================

    private int id;              // private: accessible only within class
    String name;                 // default: package-level access
    protected double salary;     // protected: package + subclass
    public String companyName = "ABC Corp"; // public: accessible everywhere

    // =========================
    // Constructor
    // =========================

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // =========================
    // Getters and Setters
    // =========================

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // =========================
    // Public method
    // =========================

    public void displayInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

