import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/reservation_db",
                    "root",
                    "Arushi@1971");

            return con;

        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
