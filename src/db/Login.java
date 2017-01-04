
package db;

import static db.DBConnect.conn;
import static db.DBConnect.createConnection;
import java.net.UnknownHostException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Login 
{
    public static boolean checkCredentials(String user, String password) throws UnknownHostException, SQLException
    {
        createConnection();
        
        boolean correctPassword = false;
        
        PreparedStatement statement = conn.prepareStatement("SELECT PASSWORD FROM PHYSICIANS WHERE USERNAME = ?");
        statement.setString(1,user);
        ResultSet rs = statement.executeQuery();
        
        if (!rs.next()) 
        {    
            JOptionPane.showMessageDialog(null, "This username does not exist.");
        } 
        
        else
        {
            String hashedPw = rs.getString("PASSWORD");
                
            if (BCrypt.checkpw(password, hashedPw))
                correctPassword = true;
            else
            {
                correctPassword = false;
                JOptionPane.showMessageDialog(null, "Wrong password!");
            }
        }
        
        if (conn!=null)
            conn.close();
        
        return correctPassword;
    }
}
