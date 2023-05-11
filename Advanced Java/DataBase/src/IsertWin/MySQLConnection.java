package IsertWin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
private static Connection con;
public static final String URL = "jdbc:mysql://localhost/nomBD";
public static final String USER = "YOUR_DATABASE_USERNAME";
public static final String PASSWORD = " YOUR_DATABASE_PASSWORD";
public static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";
//private constructor
private MySQLConnection() {

try { Class.forName(DRIVER_CLASS);
} catch (ClassNotFoundException e) {
e.printStackTrace(); }

}
private Connection createConnection() {
try {
con= DriverManager.getConnection(URL, USER, PASSWORD);
} catch (SQLException e) {
System.out.println("ERROR: Unable to Connect to Database."); }
return con; }
public static Connection getConnection() {
if(con == null){

new MySQLConnection()
createConnection(); }

return con; }
}

