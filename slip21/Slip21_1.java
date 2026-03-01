import java.util.*;

public class Slip21_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> subjects = new LinkedList<>();

        System.out.print("Enter the number of subjects (N): ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.println("Enter " + n + " subject names:");
        for (int i = 0; i < n; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            subjects.add(sc.nextLine());
        }

        System.out.println("\nList of Subjects (using Iterator):");
        Iterator<String> it = subjects.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        sc.close();
    }
}

/*
 * Explanation:
 * This program demonstrates storing and iterating through strings using Java
 * Collections.
 * 1. LinkedList: A linear data structure that stores elements in a list format,
 * ideal for adding and removing objects.
 * 2. Iterator Interface: Instead of a normal for loop, we use an Iterator to
 * traverse the list. This is the standardized way to access elements in a
 * collection
 * regardless of its internal implementation.
 * 3. hasNext() & next(): The iterator checks if another element exists and
 * moves
 * the pointer forward to retrieve it.
 */
