import java.util.*;

public class Slip3_2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("Initial List: " + list);

        // i. Add element at the end
        list.addLast("Dragonfruit");
        System.out.println("After adding at end: " + list);

        // ii. Delete first element
        if (!list.isEmpty()) {
            list.removeFirst();
        }
        System.out.println("After deleting first: " + list);

        // iii. Display in reverse order
        System.out.println("Contents in reverse order:");
        ListIterator<String> it = list.listIterator(list.size());
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }
}

/*
 * Explanation:
 * This program uses the Java Collection Framework's LinkedList class to handle
 * String objects.
 * For part (i), it uses the addLast() method to append an element to the end of
 * the list.
 * For part (ii), it uses the removeFirst() method after checking if the list is
 * not empty.
 * For part (iii), it uses a ListIterator starting from the end of the list
 * (list.size())
 * and iterates backwards using the hasPrevious() and previous() methods.
 */
