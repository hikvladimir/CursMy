import java.sql.*;

public class DB {
    private final String HOST="localhost";
    private final String PORT="3306";
    private final String DB_NAME="simple";
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

    public void getUser(String table) throws SQLException, ClassNotFoundException {
        String sql="SELECT * FROM "+table+" WHERE `login` = 'john'";
        Statement statement=getDbConnection().createStatement();
        ResultSet res=statement.executeQuery(sql);
        while (res.next()) {
            System.out.print(res.getString("id"));
            System.out.print(" ");
            System.out.print(res.getString("login"));
            System.out.print(" ");
            System.out.println(res.getString("pass"));

        }
    }
    public void getItems (String table1) throws SQLException, ClassNotFoundException {
        String sql="SELECT * FROM "+table1+" WHERE `category` = 'hats'";
        Statement statement=getDbConnection().createStatement();
        ResultSet res=statement.executeQuery(sql);
        while (res.next()) {
            System.out.println(res.getString("category"));
        }

    }
}