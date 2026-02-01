/* Fail-Fast (throws exception), Throws ConcurrentModificationException */

import java.util.*;

public class FailFastExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("A", "B", "C"));

        for (String s : list) {
            list.add("D"); // Exception
        }
    }
}
