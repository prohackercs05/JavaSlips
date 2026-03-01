public class Slip18_1 {
    public static void main(String[] args) {
        // Access the current thread (the one executing this code)
        Thread current = Thread.currentThread();
        System.out.println("Main Thread Name: " + current.getName());
        System.out.println("Main Thread Priority: " + current.getPriority());

        // Create a custom thread
        Thread custom = new Thread("AlphaThread");
        // Set its priority (1 to 10)
        custom.setPriority(8);

        System.out.println("\nCustom Thread Name: " + custom.getName());
        System.out.println("Custom Thread Priority: " + custom.getPriority());
    }
}

/*
 * Explanation:
 * This program demonstrates basic thread metadata retrieval using Java's Thread
 * class.
 * 1. currentThread(): A static method that returns a reference to the active
 * thread
 * running the current code.
 * 2. getName(): Returns the String identifier assigned to the thread.
 * 3. getPriority(): Returns the priority value (default is 5, scale is 1-10).
 * 4. setPriority(): Changes the priority of the thread object.
 */
