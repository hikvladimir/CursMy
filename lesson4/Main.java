import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        DB db= new DB();
        try {
            db.getUser("users");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
