import javax.swing.*;
import java.awt.*;

public class Slip4_1 extends JFrame implements Runnable {
    JLabel label;
    Thread t;
    boolean visible = true;

    public Slip4_1() {
        setTitle("Blinking Text");
        setSize(400, 200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("Blinking Text!");
        label.setFont(new Font("Arial", Font.BOLD, 30));
        add(label);

        t = new Thread(this);
        t.start();

        setVisible(true);
    }

    public void run() {
        try {
            while (true) {
                if (visible) {
                    label.setText("Blinking Text!");
                } else {
                    label.setText("");
                }
                visible = !visible;
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        new Slip4_1();
    }
}

/*
 * Explanation:
 * This program demonstrates multi-threading using the Runnable interface to
 * create a blinking text effect.
 * The Slip4_1 class extends JFrame to create a window and implements Runnable
 * to define the thread's behavior.
 * Inside the run() method, a while(true) loop continuously toggles the
 * visibility of the label's text.
 * It uses label.setText("") to hide the text and
 * label.setText("Blinking Text!") to show it.
 * Thread.sleep(500) creates a half-second delay between each state change,
 * resulting in a blinking effect.
 * The thread is started in the constructor using t.start().
 */
