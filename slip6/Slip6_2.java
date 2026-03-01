import javax.swing.*;
import java.awt.*;

public class Slip6_2 extends JFrame implements Runnable {
    private String color = "RED";
    private Thread t;

    public Slip6_2() {
        setTitle("Traffic Signal Simulation");
        setSize(200, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        t = new Thread(this);
        t.start();

        setVisible(true);
    }

    public void run() {
        try {
            while (true) {
                color = "RED";
                repaint();
                Thread.sleep(5000); // 5 seconds for RED

                color = "YELLOW";
                repaint();
                Thread.sleep(2000); // 2 seconds for YELLOW

                color = "GREEN";
                repaint();
                Thread.sleep(5000); // 5 seconds for GREEN
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Draw the signal post
        g.setColor(Color.BLACK);
        g.fillRect(50, 50, 100, 350);

        // Red Light
        g.setColor(color.equals("RED") ? Color.RED : Color.DARK_GRAY);
        g.fillOval(75, 70, 50, 50);

        // Yellow Light
        g.setColor(color.equals("YELLOW") ? Color.YELLOW : Color.DARK_GRAY);
        g.fillOval(75, 170, 50, 50);

        // Green Light
        g.setColor(color.equals("GREEN") ? Color.GREEN : Color.DARK_GRAY);
        g.fillOval(75, 270, 50, 50);
    }

    public static void main(String[] args) {
        new Slip6_2();
    }
}

/*
 * Explanation:
 * This program simulates a traffic signal using Java Swing and Multithreading.
 * The Slip6_2 class extends JFrame for the display and implements Runnable to
 * use threads.
 * A thread is created and started in the constructor (t.start()).
 * Inside the run() method, a while(true) loop cycles the 'color' variable
 * between RED, YELLOW, and GREEN.
 * Thread.sleep() is used to control the duration each light stays active (5s
 * for Red/Green, 2s for Yellow).
 * The repaint() method is called after every color change to trigger the
 * paint() method.
 * The paint() method draws the circles and fills the active color while setting
 * others to DARK_GRAY.
 */
