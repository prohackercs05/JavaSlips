import javax.swing.*;
import java.awt.*;

public class S4_1 extends JFrame implements Runnable {
    JLabel label;
    Thread t;
    boolean visible = true;

    public S4_1() {
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
        new S4_1();
    }
}


