import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class S25_2 extends JFrame implements ActionListener {
    JTextArea queryArea;
    JButton btnCreate, btnAlter, btnDrop;
    Connection con;
    Statement st;

    public S25_2() {
        setTitle("DDL Query Executor");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel centerPanel = new JPanel(new BorderLayout());
        centerPanel.add(new JLabel("Type Your DDL Query Here:"), BorderLayout.NORTH);
        queryArea = new JTextArea(5, 40);
        centerPanel.add(new JScrollPane(queryArea), BorderLayout.CENTER);
        add(centerPanel, BorderLayout.CENTER);

        JPanel btnPanel = new JPanel();
        btnCreate = new JButton("Create Table");
        btnAlter = new JButton("Alter Table");
        btnDrop = new JButton("Drop Table");

        btnCreate.addActionListener(this);
        btnAlter.addActionListener(this);
        btnDrop.addActionListener(this);

        btnPanel.add(btnCreate);
        btnPanel.add(btnAlter);
        btnPanel.add(btnDrop);
        add(btnPanel, BorderLayout.SOUTH);

        
        try {
<<<<<<< HEAD
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb", "postgres", "root");
=======
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "postgres", "root");
>>>>>>> 546047a5172bffb33a481f342c8a0341ce213838
            st = con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "DB Connection Error: " + e.getMessage());
        }

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String query = queryArea.getText().trim();
        if (query.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please type a query first!");
            return;
        }

        try {
            
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(this, "Query Executed Successfully!");
            queryArea.setText("");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Execution Error: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new S25_2();
    }
}


