import java.util.*;

public class S17_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
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


