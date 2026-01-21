/* A simple Java example that demonstrates encapsulation clearly and completely. 
   Encapsulation means: Making fields private, Accessing them using public getters and setters, Controlling how data is read or modified.
   Encapsulation is the process of wrapping data and methods together and restricting direct access to data using private variables and public methods. */

package OOPS_Concepts;

public class EncapsulationExample2 {
    
	public static void main(String[] args) {
    		Pupil p = new Pupil();
       	p.setId(1);
        p.setName("Rahul");
       	p.setAge(20);
       	System.out.println("Pupil name is "+ p.getName()); // Output: Pupil name is Rahul
    	}
}

class Pupil {

    // 1. Private data members (data hiding)
    private int id;
    private String name;
    private int age;

    // 2. Public getter methods (read-only access)
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // 3. Public setter methods (controlled write access)
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        // validation logic (data protection)
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive");
        }
    }
}
