public class Slip15_1 {
    public static void main(String[] args) {
        // Get the current thread
        Thread t = Thread.currentThread();

        // Display its name and priority
        System.out.println("Current Thread Name: " + t.getName());
        System.out.println("Current Thread Priority: " + t.getPriority());

        // Create a new thread and show its properties
        Thread t2 = new Thread("MyCustomThread");
        t2.setPriority(Thread.MAX_PRIORITY);

        System.out.println("\nNew Thread Name: " + t2.getName());
        System.out.println("New Thread Priority: " + t2.getPriority());
    }
}

/*
 * Explanation:
 * This program demonstrates how to retrieve and set thread metadata in Java.
 * 1. getName(): Returns the name assigned to the thread. The default main
 * thread
 * is usually called "main".
 * 2. getPriority(): Returns an integer (1 to 10) representing the priority of
 * the thread. 5 is NORM_PRIORITY.
 * 3. setPriority(): Allows manual adjustment. Here we set t2 to MAX_PRIORITY
 * (10).
 * 4. currentThread(): A static method to access the thread currently executing
 * the code.
 */
