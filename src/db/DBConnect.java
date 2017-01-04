
package db;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DBConnect 
{
    // /C:/Users/Alex/.netbeans-derby/bookmarkmanager
    public static final String dbURL = "jdbc:derby://localhost:1527/patientexpert;create=true;dataEncryption=true;encryptionKeyLength=256;encryptionAlgorithm=AES/CBC/NoPadding;bootPassword=Thursday";
    public static String tableName;
    public static Connection conn = null;
    public static Statement stmt = null;
    
    public static void createConnection() throws UnknownHostException
    {
        try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            conn = DriverManager.getConnection(dbURL);
        }
        catch (Exception except)
        {
            except.printStackTrace();
        }
    }
    
}
