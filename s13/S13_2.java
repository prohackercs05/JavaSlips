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
            int sleepTime = random.nextInt(5000); 
            System.out.println("Thread Info: Name = " + threadName + ", Will Sleep For = " + sleepTime + " ms");

            
            Thread.sleep(sleepTime);

            System.out.println("Thread Finished (Dead): " + threadName);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

public class S13_2 {
    public static void main(String[] args) {
        
        LifeCycleThread t1 = new LifeCycleThread("Thread-Alpha");
        LifeCycleThread t2 = new LifeCycleThread("Thread-Beta");
        LifeCycleThread t3 = new LifeCycleThread("Thread-Gamma");

        t1.start(); 
        t2.start();
        t3.start();
    }
}


