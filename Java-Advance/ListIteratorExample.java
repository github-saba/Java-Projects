/* ListIterator (forward + backward + modify) */

import java.util.*;

public class ListIteratorExample {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of("A", "B", "C"));

        // ListIterator positioned at the front (by default)
        ListIterator<String> it = list.listIterator();

        // Iterating forward with modify
        while (it.hasNext()) {
            String val = it.next();
            if (val.equals("A")) {
                it.set("Apple");
            }
            if (val.equals("B")) {
                it.set("Ball");
            }
            if (val.equals("C")) {
                it.set("Cat");
            }
        }
        System.out.println(list); // Prints Apple, Ball, Cat

        // ListIterator positioned at the end
        ListIterator<String> li = list.listIterator(list.size());
        
        // Iterating in reverse
        while (li.hasPrevious()) {
            System.out.println(li.previous()); // Prints Cat, Ball, Apple
        }
    }
}
