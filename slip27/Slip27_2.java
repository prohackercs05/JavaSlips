import java.util.*;

public class Slip27_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> numbers = new LinkedList<>();

        System.out.print("Enter the number of integers (N): ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Integer " + (i + 1) + ": ");
            numbers.add(sc.nextInt());
        }

        System.out.println("\nIntegers in Reverse Order:");
        // listIterator(int index): Returns an iterator starting at the given position
        // numbers.size() points to the end of the list.
        ListIterator<Integer> lit = numbers.listIterator(numbers.size());

        while (lit.hasPrevious()) {
            System.out.println(lit.previous());
        }

        sc.close();
    }
}

/*
 * Explanation:
 * This program demonstrates list traversal using the ListIterator interface.
 * 1. LinkedList: A linear data structure from the Java Collections Framework.
 * 2. ListIterator: A more powerful iterator than the standard Iterator because:
 * - It allows bidirectional traversal (forward and backward).
 * - listIterator(numbers.size()): Initializing the iterator at the list's tail
 * allows immediate backward reading.
 * 3. Logic: hasPrevious() checks if there's a preceding element, and previous()
 * returns it while moving the cursor one position back.
 */
