import java.util.*;

public class S27_2 {
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
        
        
        ListIterator<Integer> lit = numbers.listIterator(numbers.size());

        while (lit.hasPrevious()) {
            System.out.println(lit.previous());
        }

        sc.close();
    }
}


