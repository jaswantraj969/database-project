import java.sql.*;
import javax.swing.JOptionPane;

public class javaconnect
{
    Connection conn=null;
    
    public  static Connection connerDb()
    {
        try {
           Class.forName("com.mysql.jdbc.Driver").newInstance();
           Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_database?zeroDateTimeBehavior=convertToNull","root","");

            return conn;
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Database Conncetion Problem.");
        }
        return null;
    }
            
}
  