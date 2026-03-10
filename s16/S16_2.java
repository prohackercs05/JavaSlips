import java.sql.*;
import java.util.Scanner;

public class S16_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Connection con = null;
        PreparedStatement pst = null;

        try {
<<<<<<< HEAD
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb", "postgres", "root");
=======
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "postgres", "root");
>>>>>>> 546047a5172bffb33a481f342c8a0341ce213838

            Statement st = con.createStatement();
            st.executeUpdate(
                    "CREATE TABLE IF NOT EXISTS Teacher (TNo INT PRIMARY KEY, TName VARCHAR(50), Subject VARCHAR(50))");

            
            System.out.println("Enter details for 5 Teachers:");
            String insertSql = "INSERT INTO Teacher (TNo, TName, Subject) VALUES (?, ?, ?)";
            pst = con.prepareStatement(insertSql);

            for (int i = 1; i <= 5; i++) {
                System.out.println("Teacher " + i + ":");
                System.out.print("Enter TNo: ");
                int tno = sc.nextInt();
                sc.nextLine(); 
                System.out.print("Enter TName: ");
                String tname = sc.nextLine();
                System.out.print("Enter Subject: ");
                String subject = sc.nextLine();

                pst.setInt(1, tno);
                pst.setString(2, tname);
                pst.setString(3, subject);
                pst.executeUpdate();
                System.out.println("Record Inserted.");
            }

            
            System.out.println("\nTeachers teaching 'JAVA' Subject:");
            String selectSql = "SELECT * FROM Teacher WHERE Subject = ?";
            pst = con.prepareStatement(selectSql);
            pst.setString(1, "JAVA");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                System.out.println(
                        "TNo: " + rs.getInt(1) + ", TName: " + rs.getString(2) + ", Subject: " + rs.getString(3));
            }

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            try {
                if (pst != null)
                    pst.close();
                if (con != null)
                    con.close();
                sc.close();
            } catch (Exception e) {
            }
        }
    }
}


