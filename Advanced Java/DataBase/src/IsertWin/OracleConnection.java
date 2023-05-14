package IsertWin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnection {
    private static Connection con;
    public static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
    public static final String USER = "system";
    public static final String PASSWORD = "mr";
    public static final String DRIVER_CLASS = "oracle.jdbc.OracleDriver";

    // private constructor
    private OracleConnection() {
        try {
            Class.forName(DRIVER_CLASS);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static Connection createConnection() {
        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("ERROR: Unable to Connect to Database.");
            e.printStackTrace();
            // Handle specific error ORA-28040: No matching authentication protocol
            if (e.getErrorCode() == 28040) {
                System.out.println("Please check the authentication protocol settings in the Oracle database.");
                System.out.println("Ensure that the JDBC driver and Oracle database are compatible.");
            }
        }
        return con;
    }

    public static Connection getConnection() {
        if (con == null) {
            new OracleConnection();
            con = createConnection();
        }
        return con;
    }
}
