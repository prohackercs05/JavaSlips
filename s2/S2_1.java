import java.util.*;

public class S2_1 {
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


