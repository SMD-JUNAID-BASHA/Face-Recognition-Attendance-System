import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() {

        Connection conn = null;

        try {

          
            Class.forName("com.mysql.cj.jdbc.Driver");

            
            String url = "jdbc:mysql://localhost:3306/attendance_system";

            
            String username = "root";

         
            String password = "password";

            // Create Connection
            conn = DriverManager.getConnection(url, username, password);

            System.out.println("Database Connected Successfully");

        } catch (Exception e) {

            e.printStackTrace();
        }

        return conn;
    }
}
