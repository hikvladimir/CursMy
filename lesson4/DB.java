import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class DB {
    private final String HOST="localhost";
    private final String PORT="3306";
    private final String DB_NAME="java_db";
    private final String LOGIN="root";
    private final String PASS="12345";
    
    private Connection dbConn=null;

    private Connection getDbConnection() throws ClassNotFoundException, SQLException {

        String strConn="jdbc:mysql://"+HOST+":"+PORT+"/"+DB_NAME;
        Class.forName("com.mysql.cj.jdbc.Driver");
        dbConn=DriverManager.getConnection(strConn, LOGIN, PASS);
        return dbConn;
    }
    public void isConnected() throws SQLException, ClassNotFoundException {
        dbConn=getDbConnection();
        System.out.println(dbConn.isValid(1000));
    }
}
