/*  Using Try-With-Resources */

import java.sql.*;

public class PostgresJDBCDemo {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/your_database";
        String username = "your_username";
        String password = "your_password";

        String sql = "SELECT id, name, email FROM users";

        try (
            Connection connection = DriverManager.getConnection(url, username, password);
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
        ) {

            System.out.println("Database connected successfully!");

            while (resultSet.next()) {
                System.out.println(
                        resultSet.getInt("id") + " | " +
                        resultSet.getString("name") + " | " +
                        resultSet.getString("email")
                );
            }

        } catch (SQLException e) {
            System.out.println("Database error occurred!");
            e.printStackTrace();
        }
    }
}
