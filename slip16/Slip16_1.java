import java.util.*;

public class Slip16_1 {
    public static void main(String[] args) {
        // Create TreeSet to store unique colors in sorted order
        TreeSet<String> colors = new TreeSet<>();

        // Add colors to the TreeSet
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("White");

        // Display contents in ascending order
        System.out.println("Colors in Ascending Order:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}

/*
 * Explanation:
 * This program uses a TreeSet from the Java Collection Framework to manage a
 * list of colors.
 * 1. TreeSet Implementation: A TreeSet stores elements in a self-balancing
 * binary search
 * tree (specifically a Red-Black tree). This ensures all elements are unique
 * and
 * sorted according to their natural order (lexicographical/alphabetical for
 * Strings).
 * 2. Uniqueness: If we tried to add the same color twice, the TreeSet would
 * only
 * store it once.
 * 3. Sorting: The default behavior of TreeSet is ascending order, so no extra
 * sorting library is needed to meet the requirement.
 */
