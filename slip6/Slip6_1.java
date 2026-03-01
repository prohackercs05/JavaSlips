import java.util.*;

public class Slip6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Use TreeSet to automatically handle uniqueness and sorting
        TreeSet<Integer> ts = new TreeSet<>();

        System.out.print("Enter the number of integers: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            ts.add(sc.nextInt());
        }

        System.out.println("Sorted integers (duplicates removed): " + ts);

        // Convert to ArrayList to use Collections.binarySearch as a "predefined search
        // method"
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

/*
 * Explanation:
 * This program accepts 'n' integers from the user.
 * It uses a TreeSet to store the integers because a TreeSet automatically
 * eliminates
 * duplicate elements and maintains them in ascending (sorted) order.
 * After populating the TreeSet, the program displays the sorted unique
 * elements.
 * To use a "predefined search method" from the Collection framework
 * (Collections.binarySearch),
 * the TreeSet is converted into an ArrayList.
 * Collections.binarySearch() is then used to find the position of a specific
 * element.
 */
