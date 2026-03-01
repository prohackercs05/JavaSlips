class PrintThread extends Thread {
    String text;
    int n;

    public PrintThread(String text, int n) {
        this.text = text;
        this.n = n;
    }

    public void run() {
        for (int i = 1; i <= n; i++) {
            System.out.println(text + " (Run " + i + ")");
            try {
                // Short sleep to allow interleaved output from multiple threads
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class Slip8_1 {
    public static void main(String[] args) {
        PrintThread t1 = new PrintThread("COVID19", 10);
        PrintThread t2 = new PrintThread("LOCKDOWN2020", 20);
        PrintThread t3 = new PrintThread("VACCINATED2021", 30);

        t1.start();
        t2.start();
        t3.start();
    }
}

/*
 * Explanation:
 * This program demonstrates how to define and run multiple threads with passed
 * parameters.
 * The PrintThread class extends the Thread class and uses a constructor to
 * accept the text
 * to be printed and the number of times (n) it should be displayed.
 * Inside the run() method, a simple for loop iterates 'n' times and prints the
 * text.
 * In the main method, three separate thread objects are created with unique
 * messages and counts.
 * When start() is called on each, they run concurrently, showing interleaved
 * output on the console.
 */
