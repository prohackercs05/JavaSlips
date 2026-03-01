import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Slip17_2 extends JFrame implements ActionListener, Runnable {
    private JTextField textField;
    private JButton startBtn;
    private Thread t;

    public Slip17_2() {
        setTitle("Number Display 1-100");
        setSize(300, 200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textField = new JTextField(10);
        textField.setEditable(false);
        add(textField);

        startBtn = new JButton("Start Counting");
        startBtn.addActionListener(this);
        add(startBtn);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startBtn) {
            // Create and start thread only when button is clicked
            t = new Thread(this);
            t.start();
        }
    }

    public void run() {
        try {
            for (int i = 1; i <= 100; i++) {
                textField.setText(String.valueOf(i));
                // Pause for a short delay to make the counting visible
                Thread.sleep(100);
            }
        } catch (InterruptedException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new Slip17_2();
    }
}

/*
 * Explanation:
 * This Java Swing application uses a separate thread to update a TextField with
 * numbers from 1 to 100.
 * 1. Runnable Interface: The class implements Runnable to define the counting
 * task
 * in its own thread. This prevents the GUI from freezing during the loop.
 * 2. Interaction: When the button is clicked, a Thread object is created,
 * passing 'this'
 * as a Target. t.start() initiates the run() method execution.
 * 3. Loop: The for loop iterates from 1 to 100 and updates the textField's
 * display.
 * 4. Yielding: Thread.sleep(100) is called after each count to yield execution
 * time
 * back to other threads, creating a visible counting effect.
 */
