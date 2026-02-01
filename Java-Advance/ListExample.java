/* List → allows duplicates, maintains order, ArrayList uses dynamic array */

import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Spring");
        list.add("Java"); // duplicate allowed

        System.out.println(list);
    }
}
