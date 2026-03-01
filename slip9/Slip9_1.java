import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Slip9_1 extends JFrame implements ActionListener {
    JButton btnStart;
    BallPanel panel;

    public Slip9_1() {
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
        new Slip9_1();
    }
}

class BallPanel extends JPanel implements Runnable {
    int y = 0;
    int direction = 1;

    public void run() {
        try {
            while (true) {
                // Move the ball y-coordinate
                y += (5 * direction);

                // Bounce at boundaries
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

/*
 * Explanation:
 * This program uses Java Swing and Multithreading to animate a ball moving
 * vertically.
 * 1. Slip9_1: A JFrame that contains a "Start Ball" button and a custom
 * BallPanel.
 * 2. BallPanel: Implements the Runnable interface.
 * - When the thread starts, it enters a while(true) loop that updates the 'y'
 * coordinate.
 * - If the ball hits the top or bottom of the panel (checked via getHeight()),
 * the direction is reversed.
 * - repaint() is called to redraw the ball at its new position.
 * - Thread.sleep(30) controls the speed of the animation.
 * 3. Thread Initiation: A new thread is created and started only when the user
 * clicks the button.
 */
