import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class S17_2 extends JFrame implements ActionListener, Runnable {
    private JTextField textField;
    private JButton startBtn;
    private Thread t;

    public S17_2() {
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
            
            t = new Thread(this);
            t.start();
        }
    }

    public void run() {
        try {
            for (int i = 1; i <= 100; i++) {
                textField.setText(String.valueOf(i));
                
                Thread.sleep(100);
            }
        } catch (InterruptedException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new S17_2();
    }
}


