import java.util.*;

public class Slip29_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        System.out.print("Enter how many integers (N): ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " integers:");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            list.add(val);
            sum += val;
        }

        double average = (double) sum / n;

        System.out.println("\n--- Results ---");
        System.out.println("Total Sum: " + sum);
        System.out.println("Average: " + average);

        sc.close();
    }
}

/*
 * Explanation:
 * This program performs basic statistics on a list of integers using the
 * LinkedList collection.
 * 1. Collection: LinkedList is used to store the sequence of integers.
 * 2. Summation: As each number is added to the list, it is also added to a
 * running 'sum' variable.
 * 3. Average Calculation: The average is computed by dividing the sum by the
 * total count (n).
 * We cast sum to (double) to ensure decimal precision in the result.
 */
