import java.util.Random;

class LifeCycleThread extends Thread {
    String threadName;
    Random random = new Random();

    public LifeCycleThread(String name) {
        this.threadName = name;
        System.out.println("Thread Created: " + threadName);
    }

    public void run() {
        try {
            int sleepTime = random.nextInt(5000); // 0 to 4999
            System.out.println("Thread Info: Name = " + threadName + ", Will Sleep For = " + sleepTime + " ms");

            // Sleep - transitioning thread to TIMED_WAITING state
            Thread.sleep(sleepTime);

            System.out.println("Thread Finished (Dead): " + threadName);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

public class Slip13_2 {
    public static void main(String[] args) {
        // Demonstrate lifecycle
        LifeCycleThread t1 = new LifeCycleThread("Thread-Alpha");
        LifeCycleThread t2 = new LifeCycleThread("Thread-Beta");
        LifeCycleThread t3 = new LifeCycleThread("Thread-Gamma");

        t1.start(); // Moves thread to RUNNABLE state
        t2.start();
        t3.start();
    }
}

/*
 * Explanation:
 * This program demonstrates the various stages of a thread's lifecycle: NEW,
 * RUNNABLE, TIMED_WAITING, and TERMINATED (Dead).
 * 1. Creation: In the constructor, the thread is in the NEW state. We hard-code
 * the name as requested.
 * 2. Starting: When start() is called, the thread becomes RUNNABLE and enters
 * the run() method.
 * 3. Sleeping: We use java.util.Random.nextInt(5000) to get a value between 0
 * and 4999 ms.
 * - The thread enters TIMED_WAITING state when Thread.sleep() is called.
 * 4. Completion: After waking up and finishing the run() block, the thread
 * enters the TERMINATED state.
 * 5. Execution: Multiple threads run concurrently, so the output order is
 * determined by the JVM's scheduler.
 */
