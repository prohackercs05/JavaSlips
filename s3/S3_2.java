import java.util.*;

public class S3_2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("Initial List: " + list);

        
        list.addLast("Dragonfruit");
        System.out.println("After adding at end: " + list);

        
        if (!list.isEmpty()) {
            list.removeFirst();
        }
        System.out.println("After deleting first: " + list);

        
        System.out.println("Contents in reverse order:");
        ListIterator<String> it = list.listIterator(list.size());
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }
}


