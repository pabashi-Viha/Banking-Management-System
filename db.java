
package ABCD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class db {
    
    public static Connection mycon() {
        Connection con = null;
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/finance", "root", "");
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Connection Error: " + e.getMessage());
        }
        return con;
    }
}

