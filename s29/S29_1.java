import java.sql.*;
import java.util.Scanner;

public class S29_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter table name to view metadata: ");
        String tableName = sc.nextLine();

        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb", "postgres",
                    "root");

            Statement st = con.createStatement();
            
            ResultSet rs = st.executeQuery("SELECT * FROM " + tableName + " LIMIT 1");
            ResultSetMetaData rsmd = rs.getMetaData();

            int count = rsmd.getColumnCount();
            System.out.println("\nMetadata for table: " + tableName);
            System.out.println("-------------------------------------------------");
            System.out.printf("%-20s %-15s %-10s\n", "Column Name", "Type", "Size");
            System.out.println("-------------------------------------------------");

            for (int i = 1; i <= count; i++) {
                System.out.printf("%-20s %-15s %-10d\n",
                        rsmd.getColumnName(i),
                        rsmd.getColumnTypeName(i),
                        rsmd.getColumnDisplaySize(i));
            }

            con.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}


