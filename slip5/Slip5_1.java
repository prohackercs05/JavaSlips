import java.util.*;

public class Slip5_1 {
    public static void main(String[] args) {
        Hashtable<String, String> ht = new Hashtable<String, String>();

        ht.put("9876543210", "Alice");
        ht.put("8765432109", "Bob");
        ht.put("7654321098", "Charlie");
        ht.put("6543210987", "David");

        System.out.println("Student Details (Mobile Number : Name):");
        Enumeration<String> keys = ht.keys();

        while (keys.hasMoreElements()) {
            String mobile = keys.nextElement();
            String name = ht.get(mobile);
            System.out.println(mobile + " : " + name);
        }
    }
}

/*
 * Explanation:
 * This program uses a Hashtable to map student mobile numbers (keys) to student
 * names (values).
 * The Hashtable class is part of java.util and is synchronized, making it
 * thread-safe.
 * To display the contents, we use the keys() method which returns an
 * Enumeration of the keys.
 * The Enumeration interface provides two methods:
 * 1. hasMoreElements(): Checks if there are more keys to iterate over.
 * 2. nextElement(): Retrieves the next key in the sequence.
 * Using the key, we fetch the corresponding name from the Hashtable using the
 * get() method.
 */
