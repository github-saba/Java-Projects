/* Map → key-value pair, HashMap uses array + linked list / tree */

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Spring");
        map.put(1, "Hibernate"); // overwrites value

        System.out.println(map);
    }
}
