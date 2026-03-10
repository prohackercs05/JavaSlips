import java.util.Scanner;

public class S23_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Vowels in the string (every 3 seconds):");
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(str.charAt(i));
                try {
                    
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    System.err.println("Thread Error: " + e.getMessage());
                }
            }
        }
        sc.close();
    }
}


