/* A simple Java example that demonstrates encapsulation clearly and completely. */

package OOPS_Concepts;

public class EncapsulationExample {
    public static void main(String[] args) {
        
        Student st = new Student(101, "Saba", 27);
        System.out.println("Student id: "+ st.getId());
        System.out.println("Student name: "+ st.getName());
        System.out.println("Student age: "+ st.getAge());
    }    
}

class Student {
    
    // 1. Private data members (data hiding)
    private int id;
    private String name;
    private int age;

    // 2. Parameterized constructor (to create an object with initial values)
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // 3. Public getter methods (read-only access)
    public int getId() {
        return id;
    }

    // 4. Public setter methods (controlled write access)
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
