import java.util.Random;

class RandomNumberGenerator extends Thread {
    public void run() {
        Random random = new Random();
        for (int i = 0; i < 5; i++) { // Limit to 5 numbers for demonstration
            int randomInt = random.nextInt(100);
            System.out.println("Generated Number: " + randomInt);
            if (randomInt % 2 == 0) {
                SquareThread st = new SquareThread(randomInt);
                st.start();
            } else {
                CubeThread ct = new CubeThread(randomInt);
                ct.start();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}

class SquareThread extends Thread {
    int n;

    SquareThread(int n) {
        this.n = n;
    }

    public void run() {
        System.out.println("Square of " + n + " is: " + (n * n));
    }
}

class CubeThread extends Thread {
    int n;

    CubeThread(int n) {
        this.n = n;
    }

    public void run() {
        System.out.println("Cube of " + n + " is: " + (n * n * n));
    }
}

public class Slip7_1 {
    public static void main(String[] args) {
        RandomNumberGenerator rng = new RandomNumberGenerator();
        rng.start();
    }
}

/*
 * Explanation:
 * This program demonstrates multi-threading where multiple threads communicate
 * and perform specialized tasks.
 * 1. RandomNumberGenerator (Thread 1): Generates a random integer every 1
 * second using Random.nextInt().
 * If the number is even, it creates and starts a SquareThread.
 * If the number is odd, it creates and starts a CubeThread.
 * 2. SquareThread (Thread 2): Receives an even integer and prints its square.
 * 3. CubeThread (Thread 3): Receives an odd integer and prints its cube.
 * Each secondary thread is short-lived, executing its task and finishing, while
 * the main generator continues loop.
 */
