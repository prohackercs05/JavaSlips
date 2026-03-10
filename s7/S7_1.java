import java.util.Random;

class RandomNumberGenerator extends Thread {
    public void run() {
        Random random = new Random();
        for (int i = 0; i < 5; i++) { 
            int randomInt = random.nextInt(100);
            System.out.println("Generated Number: " + randomInt);
            if (randomInt % 2 == 0) {
                SquareThread st = new SquareThread(randomInt);
                st.start();
            } else {
                CubeThread ct = new CubeThread(randomInt);
                ct.start();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}

class SquareThread extends Thread {
    int n;

    SquareThread(int n) {
        this.n = n;
    }

    public void run() {
        System.out.println("Square of " + n + " is: " + (n * n));
    }
}

class CubeThread extends Thread {
    int n;

    CubeThread(int n) {
        this.n = n;
    }

    public void run() {
        System.out.println("Cube of " + n + " is: " + (n * n * n));
    }
}

public class S7_1 {
    public static void main(String[] args) {
        RandomNumberGenerator rng = new RandomNumberGenerator();
        rng.start();
    }
}


