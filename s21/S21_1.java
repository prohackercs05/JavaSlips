import java.util.*;

public class S21_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> subjects = new LinkedList<>();

        System.out.print("Enter the number of subjects (N): ");
        int n = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter " + n + " subject names:");
        for (int i = 0; i < n; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            subjects.add(sc.nextLine());
        }

        System.out.println("\nList of Subjects (using Iterator):");
        Iterator<String> it = subjects.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        sc.close();
    }
}


