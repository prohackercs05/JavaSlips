import java.sql.*;
import java.util.Scanner;

public class S30_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Connection con = null;
        Statement st = null;

        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb", "postgres", "root");
            st = con.createStatement();

            
            st.executeUpdate(
                    "CREATE TABLE IF NOT EXISTS Teacher (TNo INT PRIMARY KEY, TName VARCHAR(50), Subject VARCHAR(50))");
            System.out.println("Table 'Teacher' is ready.");

            
            System.out.println("\nEnter 5 Teacher details:");
            for (int i = 1; i <= 5; i++) {
                System.out.println("Teacher " + i + ":");
                System.out.print("Enter TNo: ");
                int tno = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter TName: ");
                String tname = sc.nextLine();
                System.out.print("Enter Subject: ");
                String subject = sc.nextLine();

                String insertSql = "INSERT INTO Teacher VALUES (" + tno + ", '" + tname + "', '" + subject + "')";
                st.executeUpdate(insertSql);
            }

            
            System.out.println("\nTeachers for 'JAVA' Subject:");
            ResultSet rs = st.executeQuery("SELECT * FROM Teacher WHERE Subject = 'JAVA'");

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt(1) + ", Name: " + rs.getString(2) + ", Sub: " + rs.getString(3));
            }

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            try {
                if (st != null)
                    st.close();
                if (con != null)
                    con.close();
                sc.close();
            } catch (Exception e) {
            }
        }
    }
}


