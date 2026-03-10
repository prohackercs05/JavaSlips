import javax.swing.*;
import java.awt.*;

public class S20_2 extends JFrame implements Runnable {
    private JLabel imageLabel;
    private boolean visible = true;
    private Thread t;

    public S20_2() {
        setTitle("Blinking Image Application");
        setSize(400, 400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
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
                
                visible = !visible;
                imageLabel.setVisible(visible);

                
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.err.println("Thread Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        new S20_2();
    }
}


