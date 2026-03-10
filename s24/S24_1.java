import javax.swing.*;
import java.awt.*;

public class S24_1 extends JFrame implements Runnable {
    private String text = "Scrolling Text from Left to Right...";
    private int x = 0;
    private Thread t;

    public S24_1() {
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
                
                x += 5;

                
                if (x > getWidth()) {
                    x = -150; 
                }

                repaint();
                Thread.sleep(50); 
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
        
        g.drawString(text, x, 100);
    }

    public static void main(String[] args) {
        new S24_1();
    }
}


