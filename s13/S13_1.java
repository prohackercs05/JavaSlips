import java.sql.*;

public class S13_1 {
    public static void main(String[] args) {
        try {
<<<<<<< HEAD
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb", "postgres", "root");
=======
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "postgres", "root");
>>>>>>> 546047a5172bffb33a481f342c8a0341ce213838

            
            DatabaseMetaData dbmd = con.getMetaData();

            
            System.out.println("Database Product Name: " + dbmd.getDatabaseProductName());
            System.out.println("Database Product Version: " + dbmd.getDatabaseProductVersion());
            System.out.println("Driver Name: " + dbmd.getDriverName());
            System.out.println("Driver Version: " + dbmd.getDriverVersion());
            System.out.println("User Name: " + dbmd.getUserName());
            System.out.println("URL: " + dbmd.getURL());

            
            System.out.println("\nList of Tables in 'testdb':");
            String[] types = { "TABLE" };
            ResultSet rs = dbmd.getTables(null, null, "%", types);

            while (rs.next()) {
                System.out.println("Table Name: " + rs.getString("TABLE_NAME"));
            }

            con.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


