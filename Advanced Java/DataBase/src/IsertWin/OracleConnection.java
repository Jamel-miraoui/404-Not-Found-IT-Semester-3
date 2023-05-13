package IsertWin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnection {
    private static Connection con;
    public static final String URL = "jdbc:oracle:thin:@localhost:1521:ORCL";
    public static final String USER = "system";
    public static final String PASSWORD = "mr";
    public static final String DRIVER_CLASS = "oracle.jdbc.driver.OracleDriver";

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
