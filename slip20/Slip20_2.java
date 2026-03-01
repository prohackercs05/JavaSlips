import javax.swing.*;
import java.awt.*;

public class Slip20_2 extends JFrame implements Runnable {
    private JLabel imageLabel;
    private boolean visible = true;
    private Thread t;

    public Slip20_2() {
        setTitle("Blinking Image Application");
        setSize(400, 400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Assuming image.png is in the current directory
        ImageIcon icon = new ImageIcon("image.png");
        imageLabel = new JLabel(icon);
        add(imageLabel);

        t = new Thread(this);
        t.start();

        setVisible(true);
    }

    public void run() {
        try {
            while (true) {
                // Toggle visibility
                visible = !visible;
                imageLabel.setVisible(visible);

                // Pause for blinking effect (500ms)
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.err.println("Thread Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        new Slip20_2();
    }
}

/*
 * Explanation:
 * This Java Swing program uses multithreading to create a blinking image
 * effect.
 * 1. Runnable: The Slip20_2 class implements the Runnable interface to define
 * the thread's behavior in its run() method.
 * 2. GUI Component: It uses a JLabel with an ImageIcon to display 'image.png'.
 * 3. Loop: Inside the run() method, a while(true) loop continuously toggles
 * the 'visible' boolean and sets the label's visibility based on it.
 * 4. Yielding: Thread.sleep(500) creates a half-second delay between state
 * changes,
 * resulting in the visible blinking behavior.
 * 5. Concurrent Task: Using a separate thread ensures that the GUI remains
 * responsive while the animation occurs.
 */
