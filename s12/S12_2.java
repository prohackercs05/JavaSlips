import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class S12_2 extends JFrame {
    JTable table;
    DefaultTableModel model;

    public S12_2() {
        setTitle("Project Table Viewer");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        
        model = new DefaultTableModel();
        model.addColumn("Project ID");
        model.addColumn("Project Name");
        model.addColumn("Description");
        model.addColumn("Status");

        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        
        setupDatabaseAndLoadData();

        setVisible(true);
    }

    private void setupDatabaseAndLoadData() {
        try {
<<<<<<< HEAD
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb", "postgres", "root");
=======
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "postgres", "root");
>>>>>>> 546047a5172bffb33a481f342c8a0341ce213838
            Statement st = con.createStatement();

            
            String sqlCreate = "CREATE TABLE IF NOT EXISTS PROJECT (" +
                    "project_id INT PRIMARY KEY, " +
                    "Project_name VARCHAR(100), " +
                    "Project_description TEXT, " +
                    "Project_Status VARCHAR(20))";
            st.executeUpdate(sqlCreate);

            
            
            st.executeUpdate(
                    "INSERT INTO PROJECT VALUES (1, 'E-Commerce', 'Shopping Website', 'In Progress') ON CONFLICT (project_id) DO NOTHING");
            st.executeUpdate(
                    "INSERT INTO PROJECT VALUES (2, 'CRM System', 'Client Relationship Manager', 'Completed') ON CONFLICT (project_id) DO NOTHING");
            st.executeUpdate(
                    "INSERT INTO PROJECT VALUES (3, 'Hospital CRM', 'Managing Patient Records', 'Pending') ON CONFLICT (project_id) DO NOTHING");

            
            model.setRowCount(0);
            ResultSet rs = st.executeQuery("SELECT * FROM PROJECT");
            while (rs.next()) {
                model.addRow(new Object[] {
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)
                });
            }

            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        new S12_2();
    }
}


