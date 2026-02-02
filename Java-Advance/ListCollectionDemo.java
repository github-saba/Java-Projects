/* Java Collection (List hierarchy) – Demo Class.
  A single Java demo class that uses all the List-related Collection types in a clean, 
  interview-ready way, with simple comments explaining each one. 
  Iterable → Collection → List → implementations

  @Refer - The image <listhierarchy.png> in Java-Advance folder
  Iterable → Enables for-each loop
  Collection → Basic data structure operations
  List → Ordered, allows duplicates
  ArrayList → Fast access, not thread-safe
  LinkedList → Fast insert/delete
  Vector → Synchronized (legacy)
  Stack → LIFO
  CopyOnWriteArrayList → Thread-safe, read-heavy
  AbstractList → Base class for List implementations
*/

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListCollectionDemo {

    public static void main(String[] args) {

        /*
         * ITERABLE
         * Root interface of the Collection framework
         * Allows objects to be iterated using for-each loop
         */
        Iterable<String> iterable = new ArrayList<>();
        iterable.forEach(item -> System.out.println(item));

        /*
         * COLLECTION
         * Parent interface of List, Set, Queue
         * Provides basic operations like add, remove, size
         */
        Collection<String> collection = new ArrayList<>();
        collection.add("A");
        collection.add("B");

        /*
         * LIST
         * Allows duplicate elements
         * Maintains insertion order
         */
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Apple"); // duplicates allowed

        /*
         * ARRAYLIST
         * Resizable array
         * Fast random access
         * Not synchronized
         */
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Spring");

        /*
         * LINKEDLIST
         * Doubly linked list
         * Faster insertion/deletion than ArrayList
         */
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Node1");
        linkedList.add("Node2");

        /*
         * VECTOR
         * Legacy class
         * Synchronized (thread-safe)
         * Slower due to synchronization
         */
        Vector<String> vector = new Vector<>();
        vector.add("V1");
        vector.add("V2");

        /*
         * STACK
         * Child class of Vector
         * Follows LIFO (Last In First Out)
         */
        Stack<String> stack = new Stack<>();
        stack.push("Bottom");
        stack.push("Top");
        stack.pop(); // removes "Top"

        /*
         * COPYONWRITEARRAYLIST
         * Thread-safe variant of ArrayList
         * Creates a new copy on modification
         * Best for read-heavy operations
         */
        CopyOnWriteArrayList<String> cowList = new CopyOnWriteArrayList<>();
        cowList.add("Read");
        cowList.add("Mostly");

        /*
         * ABSTRACTLIST
         * Abstract class that partially implements List
         * Cannot be instantiated directly
         * ArrayList and LinkedList extend this class
         */
        AbstractList<String> abstractList = new ArrayList<>();
        abstractList.add("Abstract");
        abstractList.add("List");

        // Print one example to confirm execution
        System.out.println("ArrayList: " + arrayList);
    }
}

