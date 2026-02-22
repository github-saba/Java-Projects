/* JDBC example for PostgreSQL (With Exception Handling & Closing Resources) */

import java.sql.*;

public class DemoJDBC1 {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/your_database";
        String username = "your_username";
        String password = "your_password";
        String sql = "select * from student";

        try {
            // Create connection
            Connection con = DriverManager.getConnection(url, uname, pass);
            System.out.println("Connection Established");

            // Create statement
            Statement st = con.createStatement();

            // Execute query
            ResultSet rs = st.executeQuery(sql);

            // Process result
            while (rs.next()) {
                System.out.println(
                        "Student Id: " + rs.getInt("sid") + "  " +
                        "Student Name: " + rs.getString("sname") + "  " +
                        "Student Marks: " + rs.getInt("marks")
                );
            }

        } catch (SQLException e) {
            System.out.println("Database error occurred!");
            e.printStackTrace();

        } finally {
            // Close ResultSet
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            // Close Statement
            try {
                if (st != null) {
                    st.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            // Close Connection
            try {
                if (con != null) {
                    con.close();
                    System.out.println("Connection Closed");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
