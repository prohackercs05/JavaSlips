import java.util.*;

public class Slip23_2 {
    public static void main(String[] args) {
        // Step 1: Check if arguments are provided
        if (args.length == 0) {
            System.out.println("Please provide student names as command-line arguments.");
            System.out.println("Example: java Slip23_2 Rahul Sagar Anita");
            return;
        }

        // Step 2: Store names into an ArrayList
        List<String> studentList = new ArrayList<>();
        Collections.addAll(studentList, args);

        // Step 3: Display using Iterator interface
        System.out.println("Displaying using Iterator interface:");
        Iterator<String> it = studentList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Step 4: Display using ListIterator interface (forward then backward)
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

/*
 * Explanation:
 * This program demonstrates specialized iteration techniques for list-based
 * collections.
 * 1. Command-line Input: Names are passed as arguments to the main method (args
 * array).
 * 2. ArrayList: Chosen because it supports both Iterator and ListIterator
 * efficiently.
 * 3. Iterator: A standard interface that allows unidirectional (forward)
 * traversal of any collection.
 * 4. ListIterator: A specialized iterator for Lists that allows:
 * - Bidirectional traversal (using hasPrevious() and previous()).
 * - Modification/addition of elements during iteration (though not utilized
 * here).
 * 5. Display: The program first lists names normally, then shows the
 * versatility of
 * ListIterator by traversing the list in both directions.
 */
