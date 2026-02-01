/* Fail-Safe (no exception) */

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeExample {
    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("A");
        list.add("B");

        for (String s : list) {
            list.add("C"); // safe
        }
        System.out.println(list);
    }
}
