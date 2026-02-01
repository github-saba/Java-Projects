/* Comparator (custom sorting), Comparator → external logic */

import java.util.*;

public class ComparatorExample {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(112, 25, "Cherry"));
        list.add(new Student(103, 20, "Devon"));
        list.add(new Student(109, 26, "Antony"));
        list.add(new Student(126, 27, "Bachir"));

        Collections.sort(list, (s1, s2) -> s1.name.compareTo(s2.name));
        System.out.println(list);
    }
}

class Student {
    int id;
    int age;
    String name;

    Student(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return id + " - " + name + " - " + age;
    }
}