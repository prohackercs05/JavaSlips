import java.sql.*;

public class S11_2 {
    public static void main(String[] args) {
        try {
<<<<<<< HEAD
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb", "postgres", "root");
=======
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "postgres", "root");
>>>>>>> 546047a5172bffb33a481f342c8a0341ce213838

            Statement st = con.createStatement();

            
            ResultSet rs = st.executeQuery("SELECT * FROM DONAR");

            
            ResultSetMetaData rsmd = rs.getMetaData();

            int columnCount = rsmd.getColumnCount();
            System.out.println("No. of Columns: " + columnCount);
            System.out.println("------------------------------------------------------------------");
            System.out.printf("%-20s %-15s %-10s\n", "Column Name", "Data Type", "Size");
            System.out.println("------------------------------------------------------------------");

            for (int i = 1; i <= columnCount; i++) {
                String name = rsmd.getColumnName(i);
                String type = rsmd.getColumnTypeName(i);
                int size = rsmd.getColumnDisplaySize(i);

                System.out.printf("%-20s %-15s %-10d\n", name, type, size);
            }

            con.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Note: Ensure the 'DONAR' table exists in 'testdb'.");
        }
    }
}


