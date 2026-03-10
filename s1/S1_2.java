import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class S1_2 extends JFrame implements ActionListener {

    JLabel l1, l2, l3, l4;
    JTextField t1, t2, t3, t4;
    JButton b1;

    public S1_2() {

        setTitle("Employee Details");
        setSize(400, 300);
        setLayout(new GridLayout(5, 2, 10, 10));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        l1 = new JLabel("Employee No:");
        t1 = new JTextField();

        l2 = new JLabel("Employee Name:");
        t2 = new JTextField();

        l3 = new JLabel("Designation:");
        t3 = new JTextField();

        l4 = new JLabel("Salary:");
        t4 = new JTextField();

        b1 = new JButton("Save to Database");
        b1.addActionListener(this);

        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);
        add(l4); add(t4);
        add(new JLabel(""));
        add(b1);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1) {

            try {
                int eno = Integer.parseInt(t1.getText());
                String ename = t2.getText();
                String desig = t3.getText();
                double sal = Double.parseDouble(t4.getText());

<<<<<<< HEAD
                Class.forName("org.postgresql.Driver");
                con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb", "postgres", "root");
=======
                
                Class.forName("org.postgresql.Driver");

                
                Connection con = DriverManager.getConnection(
                        "jdbc:postgresql://localhost:5432/projectdb",
                        "postgres",
                        "root"
                );

                
                PreparedStatement pst = con.prepareStatement(
                        "INSERT INTO employee (eno, ename, designation, salary) VALUES (?, ?, ?, ?)"
                );
>>>>>>> 546047a5172bffb33a481f342c8a0341ce213838

                pst.setInt(1, eno);
                pst.setString(2, ename);
                pst.setString(3, desig);
                pst.setDouble(4, sal);

                int result = pst.executeUpdate();

                if (result > 0) {
                    JOptionPane.showMessageDialog(this, "Record Inserted Successfully!");
                    t1.setText("");
                    t2.setText("");
                    t3.setText("");
                    t4.setText("");
                }

                pst.close();
                con.close();

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter valid numeric values.");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Database Error: " + ex.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        new S1_2();
    }
}


