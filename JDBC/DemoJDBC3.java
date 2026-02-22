/* JDBC example for PostgreSQL / inserting data (Using Try-With-Resources)  
  Why executeUpdate() instead of execute()? 
  1 .executeUpdate() → used for: INSERT / UPDATE / DELETE
  2. Returns number of affected rows.
  3. execute() is more generic and not preferred here. */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DemoJDBC3 {

    public static void main(String[] args) {

        int sid = 7;
        String sname = "David";
        int marks = 56;

        String url = "jdbc:postgresql://localhost:5432/your_database";
        String uname = "your_username";
        String pass = "your_password";
        String sql = "INSERT INTO student (sid, sname, marks) VALUES (?,?,?)";

        try (
            Connection con = DriverManager.getConnection(url, uname, pass);
            PreparedStatement st = con.prepareStatement(sql);
        ) {

            System.out.println("Connection Established");

            // Set parameters
            st.setInt(1, sid);
            st.setString(2, sname);
            st.setInt(3, marks);

            // Execute INSERT
            int rowsAffected = st.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Record inserted successfully!");
            } else {
                System.out.println("Insert failed.");
            }

        } catch (SQLException e) {
            System.out.println("Database error occurred!");
            e.printStackTrace();
        }

        System.out.println("Connection Closed");
    }
}
