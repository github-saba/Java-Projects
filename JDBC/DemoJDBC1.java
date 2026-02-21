import java.sql.*;

public class DemoJDBC1 {
    public static void main(String[] args) throws Exception {
       /*   import package
            load and register
            create connection
            create statement
            execute statement
            process the results
            close connection
       */
        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "0000";
        String sql = "select * from student";

        //Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("Connection Established");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            System.out.println ("Student Id:  "+ rs.getInt("sid") + "  "+
                    "Student Name:  "+ rs.getString("sname")+ "   "+
                    "Student Marks:  "+ rs.getInt("marks")
            );
        }
        con.close();
        System.out.println("Connection Closed");
    }
}
