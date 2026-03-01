public class Slip28_1 {
    public static void main(String[] args) {
        // Retrieve the current thread instance executing this main method
        Thread t = Thread.currentThread();

        // Print the identifier of the active thread
        System.out.println("The currently executing thread name is: " + t.getName());
    }
}

/*
 * Explanation:
 * This program demonstrates how to identify the execution context in a
 * multithreaded environment.
 * 1. currentThread(): A static method of the Thread class that returns a
 * reference
 * to the thread currently executing the code.
 * 2. getName(): Retrieves the human-readable identifier assigned to the thread.
 * The primary entry thread in Java applications is named "main" by default.
 */
