import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db?" +
                "useSSL=false&zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC", "ADMIN", "admin");

        //Statement stmt = connection.createStatement();
        //ResultSet rs = (ResultSet) stmt.executeQuery("select * from person");
        //rs.next();

        connection.close();
    }
}
