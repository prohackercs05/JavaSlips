public class S15_1 {
    public static void main(String[] args) {
        
        Thread t = Thread.currentThread();

        
        System.out.println("Current Thread Name: " + t.getName());
        System.out.println("Current Thread Priority: " + t.getPriority());

        
        Thread t2 = new Thread("MyCustomThread");
        t2.setPriority(Thread.MAX_PRIORITY);

        System.out.println("\nNew Thread Name: " + t2.getName());
        System.out.println("New Thread Priority: " + t2.getPriority());
    }
}


