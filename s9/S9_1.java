import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class S9_1 extends JFrame implements ActionListener {
    JButton btnStart;
    BallPanel panel;

    public S9_1() {
        setTitle("Moving Ball Vertically");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        btnStart = new JButton("Start Ball");
        btnStart.addActionListener(this);
        add(btnStart, BorderLayout.NORTH);

        panel = new BallPanel();
        add(panel, BorderLayout.CENTER);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnStart) {
            Thread t = new Thread(panel);
            t.start();
        }
    }

    public static void main(String[] args) {
        new S9_1();
    }
}

class BallPanel extends JPanel implements Runnable {
    int y = 0;
    int direction = 1;

    public void run() {
        try {
            while (true) {
                
                y += (5 * direction);

                
                if (y <= 0 || y >= getHeight() - 30) {
                    direction *= -1;
                }

                repaint();
                Thread.sleep(30);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval(getWidth() / 2 - 15, y, 30, 30);
    }
}


