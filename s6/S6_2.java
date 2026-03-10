import javax.swing.*;
import java.awt.*;

public class S6_2 extends JFrame implements Runnable {
    private String color = "RED";
    private Thread t;

    public S6_2() {
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
                Thread.sleep(5000); 

                color = "YELLOW";
                repaint();
                Thread.sleep(2000); 

                color = "GREEN";
                repaint();
                Thread.sleep(5000); 
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        
        g.setColor(Color.BLACK);
        g.fillRect(50, 50, 100, 350);

        
        g.setColor(color.equals("RED") ? Color.RED : Color.DARK_GRAY);
        g.fillOval(75, 70, 50, 50);

        
        g.setColor(color.equals("YELLOW") ? Color.YELLOW : Color.DARK_GRAY);
        g.fillOval(75, 170, 50, 50);

        
        g.setColor(color.equals("GREEN") ? Color.GREEN : Color.DARK_GRAY);
        g.fillOval(75, 270, 50, 50);
    }

    public static void main(String[] args) {
        new S6_2();
    }
}


