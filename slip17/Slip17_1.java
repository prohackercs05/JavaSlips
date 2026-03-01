import java.util.*;

public class Slip17_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Use TreeSet to handle uniqueness and automatic sorting
        TreeSet<Integer> numbers = new TreeSet<>();

        System.out.print("Enter the number of integers (N): ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Integer " + (i + 1) + ": ");
            numbers.add(sc.nextInt());
        }

        System.out.println("\nIntegers in sorted order (duplicates removed):");
        for (int num : numbers) {
            System.out.println(num);
        }

        sc.close();
    }
}

/*
 * Explanation:
 * This program accepts N integers from the user and stores them in a TreeSet.
 * 1. TreeSet: It is the ideal collection class for this requirement because:
 * - It does not allow duplicate elements (Set interface).
 * - It automatically maintains elements in their natural sorted order
 * (ascending).
 * 2. Uniqueness: If the user enters the same number twice, the second entry
 * is discarded by the set.
 * 3. Performance: TreeSet provides O(log n) time complexity for insertion,
 * ensuring efficiency even for larger values of N.
 */
