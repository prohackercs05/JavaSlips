import java.util.Scanner;

public class Slip23_1 {
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
                    // 3000 milliseconds = 3 seconds
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    System.err.println("Thread Error: " + e.getMessage());
                }
            }
        }
        sc.close();
    }
}

/*
 * Explanation:
 * This program identifies and displays vowels from a user-provided string with
 * a timing delay.
 * 1. String Traversal: The program iterates through the input string one
 * character at a time.
 * 2. Vowel Check: Character.toLowerCase() converts the char to ensure both
 * uppercase and
 * lowercase vowels (a, e, i, o, u) are detected.
 * 3. Thread Delay: Thread.sleep(3000) is used to pause the program's execution
 * for 3 seconds
 * after each vowel is found and printed.
 * 4. Error Handling: The sleep method throws an InterruptedException, which is
 * caught and
 * handled within a try-catch block.
 */
