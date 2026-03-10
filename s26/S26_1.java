import java.sql.*;

public class S26_1 {
    public static void main(String[] args) {
        
        if (args.length == 0) {
            System.out.println("Please provide the Employee ID (ENo) as an argument.");
            System.out.println("Usage: java S26_1 <ENo>");
            return;
        }

        int eno;
        try {
            eno = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid Employee ID. Please enter a number.");
            return;
        }

        Connection con = null;
        PreparedStatement pst = null;

        try {
            
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb", "postgres", "root");

            
            String sql = "DELETE FROM employee WHERE eno = ?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, eno);

            
            int rowsDeleted = pst.executeUpdate();

            if (rowsDeleted > 0) {
                System.out.println("Successfully deleted record for ENo: " + eno);
            } else {
                System.out.println("No employee found with ENo: " + eno);
            }

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            
            try {
                if (pst != null)
                    pst.close();
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}


