public class S18_1 {
    public static void main(String[] args) {
        
        Thread current = Thread.currentThread();
        System.out.println("Main Thread Name: " + current.getName());
        System.out.println("Main Thread Priority: " + current.getPriority());

        
        Thread custom = new Thread("AlphaThread");
        
        custom.setPriority(8);

        System.out.println("\nCustom Thread Name: " + custom.getName());
        System.out.println("Custom Thread Priority: " + custom.getPriority());
    }
}


