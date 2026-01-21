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

    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

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
