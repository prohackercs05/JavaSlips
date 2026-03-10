import java.util.*;

public class S16_1 {
    public static void main(String[] args) {
        
        TreeSet<String> colors = new TreeSet<>();

        
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("White");

        
        System.out.println("Colors in Ascending Order:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}


