import java.util.*;

public class S29_2 {
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


