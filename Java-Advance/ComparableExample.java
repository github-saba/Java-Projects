/* Comparable (natural sorting), Comparable → class itself */

import java.util.*;

public class ComparableExample {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        
        list.add(new Student(105, 25, "Aysha"));
        list.add(new Student(107, 20, "Bala"));
        list.add(new Student(101, 26, "Cathy"));
        list.add(new Student(103, 27, "David"));

        Collections.sort(list);
        System.out.println(list);
    }
}

class Student implements Comparable<Student> {
    int id;
    int age;
    String name;

    Student(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int compareTo(Student s) {
        return this.id - s.id; // Sort by id
    }
    
    public String toString() {
        return id + " - " + name + " - " + age;
    }
}