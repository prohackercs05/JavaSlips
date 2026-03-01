import javax.swing.*;
import java.awt.*;

public class Slip24_1 extends JFrame implements Runnable {
    private String text = "Scrolling Text from Left to Right...";
    private int x = 0;
    private Thread t;

    public Slip24_1() {
        setTitle("Scrolling Text Application");
        setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        t = new Thread(this);
        t.start();

        setVisible(true);
    }

    public void run() {
        try {
            while (true) {
                // Increment x position
                x += 5;

                // Reset position if text goes off the screen
                if (x > getWidth()) {
                    x = -150; // Approximated width of the text
                }

                repaint();
                Thread.sleep(50); // Speed control
            }
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.setColor(Color.BLUE);
        // Draw the string at current (x, y) position
        g.drawString(text, x, 100);
    }

    public static void main(String[] args) {
        new Slip24_1();
    }
}

/*
 * Explanation:
 * This program creates a scrolling text animation using Java Swing and
 * multithreading.
 * 1. Interface: The JFrame acts as the container, and its paint() method is
 * overridden to draw the string manually.
 * 2. Runnable: The program implements Runnable to perform the animation loop
 * in a separate thread.
 * 3. Update Logic: Inside the run() loop, we increment 'x' (the horizontal
 * coordinate).
 * 4. Boundaries: If 'x' exceeds the frame's width, it is reset to a negative
 * value
 * to make the text appear to re-enter from the left side.
 * 5. Display: repaint() triggers a new call to the paint() method with updated
 * coordinates.
 */
