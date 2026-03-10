import java.util.*;

public class S5_1 {
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


