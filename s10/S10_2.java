import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class S10_2 extends JFrame implements ActionListener {
    JTextField t1, t2, t3;
    JButton b1;

    public S10_2() {
        setTitle("Student Record Display");
        setSize(400, 250);
        setLayout(new GridLayout(4, 2, 10, 10));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new JLabel("Roll No:"));
        t1 = new JTextField();
        add(t1);

        add(new JLabel("Name:"));
        t2 = new JTextField();
        add(t2);

        add(new JLabel("Percentage:"));
        t3 = new JTextField();
        add(t3);

        b1 = new JButton("Display First Record");
        b1.addActionListener(this);
        add(new JLabel(""));
        add(b1);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
<<<<<<< HEAD
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb", "postgres", "root");
=======
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "postgres", "root");
>>>>>>> 546047a5172bffb33a481f342c8a0341ce213838
            Statement st = con.createStatement();

            
            ResultSet rs = st.executeQuery("SELECT * FROM student LIMIT 1");

            if (rs.next()) {
                t1.setText(String.valueOf(rs.getInt(1)));
                t2.setText(rs.getString(2));
                t3.setText(String.valueOf(rs.getDouble(3)));
            } else {
                JOptionPane.showMessageDialog(this, "No records found in student table!");
            }

            con.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new S10_2();
    }
}


