import java.util.*;

public class Slip2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> set = new HashSet<String>();

        System.out.print("Enter number of friends: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            set.add(sc.nextLine());
        }

        TreeSet<String> sortedSet = new TreeSet<String>(set);

        System.out.println("Names in ascending order:");
        for (String name : sortedSet) {
            System.out.println(name);
        }

        sc.close();
    }
}

/*
 * Explanation:
 * This program reads 'N' names from the user and stores them in a HashSet.
 * A HashSet is used to ensure all names are unique, though it does not maintain
 * any order.
 * To display the names in ascending order, the program converts the HashSet
 * into a TreeSet.
 * The TreeSet automatically sorts the elements in lexicographical
 * (alphabetical) order.
 * Finally, the program iterates through the TreeSet and prints each name.
 */
