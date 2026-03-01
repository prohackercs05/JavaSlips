public class Slip1_1 {
    public static void main(String[] args) {
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.println(c);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

/*
 * Explanation:
 * This program uses a simple for loop to iterate from character 'A' to 'Z'.
 * Inside the loop, it prints the current character and then calls
 * Thread.sleep(2000)
 * to pause the execution for 2000 milliseconds (which is equal to 2 seconds).
 * The try-catch block is used to handle the InterruptedException which might be
 * thrown by Thread.sleep.
 */
