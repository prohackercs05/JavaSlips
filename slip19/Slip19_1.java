import java.util.*;

public class Slip19_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        System.out.print("Enter the number of integers (N): ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Integer " + (i + 1) + ": ");
            list.add(sc.nextInt());
        }

        System.out.println("\nNegative Integers in the list:");
        boolean found = false;
        for (int num : list) {
            if (num < 0) {
                System.out.println(num);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No negative integers found.");
        }

        sc.close();
    }
}

/*
 * Explanation:
 * This program demonstrates how to use the LinkedList collection to store and
 * filter data.
 * 1. LinkedList: Part of the java.util package, this list implementation is
 * efficient
 * for sequential access and element insertion.
 * 2. Data Entry: Input is captured using the Scanner class and appended to the
 * list
 * using the add() method.
 * 3. Filtering Logic: After populating the list, the program uses an enhanced
 * for-loop
 * to iterate through each element (num).
 * 4. Conditional Check: Within the loop, the condition 'num < 0' identifies
 * negative values,
 * which are then printed to the console.
 */
