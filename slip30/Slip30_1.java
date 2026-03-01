public class Slip30_1 {
    public static void main(String[] args) {
        final String resource1 = "Resource-Alpha";
        final String resource2 = "Resource-Beta";

        // Thread 1: Locks Resource 1, then tries to lock Resource 2
        Thread t1 = new Thread() {
            public void run() {
                synchronized (resource1) {
                    System.out.println("Thread 1: Locked " + resource1);

                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                    }

                    synchronized (resource2) {
                        System.out.println("Thread 1: Locked " + resource2);
                    }
                }
            }
        };

        // Thread 2: Locks Resource 2, then tries to lock Resource 1
        Thread t2 = new Thread() {
            public void run() {
                synchronized (resource2) {
                    System.out.println("Thread 2: Locked " + resource2);

                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                    }

                    synchronized (resource1) {
                        System.out.println("Thread 2: Locked " + resource1);
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }
}

/*
 * Explanation:
 * This program demonstrates a 'Deadlock' state where two threads are stuck
 * waiting
 * for each other indefinitely.
 * 1. Dependency Cycle: Thread 1 holds 'resource1' and waits for 'resource2'.
 * Thread 2 holds 'resource2' and waits for 'resource1'.
 * 2. synchronized: This keyword ensures only one thread can hold a resource
 * lock at a time.
 * 3. Result: Neither thread can proceed because each is blocked by the other's
 * held resource.
 * The program will hang without finishing.
 */
