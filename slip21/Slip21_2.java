class Q {
    int n;
    boolean valueSet = false;

    // Method to consume a value
    synchronized int get() {
        while (!valueSet) {
            try {
                wait(); // Wait for producer to produce
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Consumed: " + n);
        valueSet = false;
        notify(); // Notify producer that value is consumed
        return n;
    }

    // Method to produce a value
    synchronized void put(int n) {
        while (valueSet) {
            try {
                wait(); // Wait for consumer to consume
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        this.n = n;
        valueSet = true;
        System.out.println("Produced: " + n);
        notify(); // Notify consumer that value is produced
    }
}

class Producer implements Runnable {
    Q q;

    Producer(Q q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }

    public void run() {
        int i = 0;
        while (i < 5) { // Limit to 5 for demonstration
            q.put(++i);
        }
    }
}

class Consumer implements Runnable {
    Q q;

    Consumer(Q q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }

    public void run() {
        int i = 0;
        while (i < 5) {
            q.get();
            i++;
        }
    }
}

public class Slip21_2 {
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
    }
}

/*
 * Explanation:
 * This program solves the classic Producer-Consumer synchronization problem.
 * 1. Synchronized Methods: used to ensure only one thread (either producer
 * or consumer) can access the resource at a time.
 * 2. wait() and notify(): These are fundamental inter-thread communication
 * methods.
 * - The Producer waits if the value is already set (valueSet = true).
 * - The Consumer waits if the value has not been produced yet (valueSet =
 * false).
 * - After producing, the producer calls notify() to wake up the consumer.
 * - After consuming, the consumer calls notify() to wake up the producer.
 * 3. Execution: This ensures that the producer generates a value AND the
 * consumer consumes it before the next generation occurs, preventing lost
 * or duplicate data.
 */
