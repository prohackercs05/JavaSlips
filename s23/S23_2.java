import java.util.*;

public class S23_2 {
    public static void main(String[] args) {
        
        if (args.length == 0) {
            System.out.println("Please provide student names as command-line arguments.");
            System.out.println("Example: java S23_2 Rahul Sagar Anita");
            return;
        }

        
        List<String> studentList = new ArrayList<>();
        Collections.addAll(studentList, args);

        
        System.out.println("Displaying using Iterator interface:");
        Iterator<String> it = studentList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        
        System.out.println("\nDisplaying using ListIterator interface (Forward):");
        ListIterator<String> lit = studentList.listIterator();
        while (lit.hasNext()) {
            System.out.println(lit.next());
        }

        System.out.println("\nDisplaying using ListIterator interface (Backward):");
        while (lit.hasPrevious()) {
            System.out.println(lit.previous());
        }
    }
}


