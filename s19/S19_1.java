import java.util.*;

public class S19_1 {
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


