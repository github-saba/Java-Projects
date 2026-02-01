/* Set → no duplicates, HashSet uses HashMap internally  */

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Spring");
        set.add("Java"); // ignored

        System.out.println(set);
    }
}
