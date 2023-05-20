package IsertWin;

import java.sql.Connection;
import java.sql.SQLException;

public class TestConnection {
    public static void main(String[] args) {
        // Get a connection from MySQLConnection class
        Connection connection = OracleConnection.getConnection();

        if (connection != null) {
            System.out.println("Connected to Oracle database.");
            try {
                // Close the connection
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Failed to establish a connection to MySQL database.");
        }
    }
}
