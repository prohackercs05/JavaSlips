import java.util.*;

public class S6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        TreeSet<Integer> ts = new TreeSet<>();

        System.out.print("Enter the number of integers: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            ts.add(sc.nextInt());
        }

        System.out.println("Sorted integers (duplicates removed): " + ts);

        
        
        ArrayList<Integer> list = new ArrayList<>(ts);

        System.out.print("Enter element to search: ");
        int searchElement = sc.nextInt();

        int result = Collections.binarySearch(list, searchElement);

        if (result >= 0) {
            System.out.println("Element " + searchElement + " found at index " + result);
        } else {
            System.out.println("Element " + searchElement + " not found.");
        }

        sc.close();
    }
}


