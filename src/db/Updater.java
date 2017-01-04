
package db;

import static db.DBConnect.conn;
import static db.DBConnect.createConnection;
import java.net.UnknownHostException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import javax.swing.JOptionPane;

public class Updater 
{
    
    public static boolean patientHistoryFound(int id) throws SQLException, UnknownHostException
    {
        createConnection();
        
        boolean found = false;
        PreparedStatement statement = conn.prepareStatement("SELECT * FROM CONSULTATIONS WHERE PATIENT_ID = ?");
        //statement.setString(1,fname);
        //statement.setString(2,lname);
        statement.setInt(1,id);
        ResultSet rs = statement.executeQuery();
        if (!rs.next())  
            found = false;
        else
            found = true;
       
        if (conn!=null)
            conn.close();
        return found;
    }
    
    public static void updatePatientPersonal(int id, String fname, String lname, int age, String address, String city,
                                             int zip, long phone, String email) throws SQLException, ParseException, UnknownHostException
    {
        createConnection();
        
        PreparedStatement statement = conn.prepareStatement("UPDATE PATIENTS SET FNAME = ?, LNAME = ?, AGE = ?, ADDRESS = ?, CITY = ?, ZIP = ?, PHONE = ?, EMAIL = ? WHERE ID = ?");
        statement.setString(1, fname);
        statement.setString(2, lname);
        statement.setInt(3, age);
        statement.setString(4, address);
        statement.setString(5, city);
        statement.setInt(6, zip);
        statement.setLong(7, phone);
        statement.setString(8, email);
        statement.setInt(9, id);
        
        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0)
        {
            JOptionPane.showMessageDialog(null, "Updated table PATIENTS successfully.");
            System.out.println(fname + " " + id);
        }
        
        if (conn!=null)
            conn.close();
    }
    
    public static void deletePatient(int id) throws SQLException, ParseException, UnknownHostException
    {
        createConnection();
        
        PreparedStatement statement = conn.prepareStatement("DELETE FROM PATIENTS WHERE ID = ?");
        PreparedStatement statement2 = conn.prepareStatement("DELETE FROM CONSULTATIONS WHERE PATIENT_ID = ?");
        statement.setInt(1, id);
        statement2.setInt(1, id);
        
        int rowsInserted = statement.executeUpdate();
        int rowsInserted2 = statement2.executeUpdate();
        if (rowsInserted > 0)
        {
            JOptionPane.showMessageDialog(null, "Deleted patient with ID " + id +" successfully.");
        }
        
        if (conn!=null)
            conn.close();
    }
    
    public static void deleteConsultation(int id) throws SQLException, ParseException, UnknownHostException
    {
        createConnection();
        
        PreparedStatement statement = conn.prepareStatement("DELETE FROM CONSULTATIONS WHERE ID = ?");
        statement.setInt(1, id);
        
        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0)
        {
            JOptionPane.showMessageDialog(null, "Deleted consultation with ID " + id +" successfully.");
        }
        
        if (conn!=null)
            conn.close();
    }
    
    public static void deleteTask(int id) throws SQLException, ParseException, UnknownHostException
    {
        createConnection();
        
        PreparedStatement statement = conn.prepareStatement("DELETE FROM TASKS WHERE ID = ?");
        statement.setInt(1, id);
        
        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0)
        {
            JOptionPane.showMessageDialog(null, "Deleted task with ID " + id +" successfully.");
        }
        
        if (conn!=null)
            conn.close();
    }
    
    public static void deleteNote(int id) throws SQLException, ParseException, UnknownHostException
    {
        createConnection();
        
        PreparedStatement statement = conn.prepareStatement("DELETE FROM NOTES WHERE ID = ?");
        statement.setInt(1, id);
        
        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0)
        {
            JOptionPane.showMessageDialog(null, "Deleted note with ID " + id +" successfully.");
        }
        
        if (conn!=null)
            conn.close();
    }
    
    public static void deleteSpecialist(int id) throws SQLException, ParseException, UnknownHostException
    {
        createConnection();
        
        PreparedStatement statement = conn.prepareStatement("DELETE FROM SPECIALISTS WHERE ID = ?");
        statement.setInt(1, id);
        
        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0)
        {
            JOptionPane.showMessageDialog(null, "Deleted specialist with ID " + id +" successfully.");
        }
        
        if (conn!=null)
            conn.close();
    }
    
    public static void addPatient(String fname, String lname, int age, String address, String city,
                                             int zip, long phone, String email, String logged) throws SQLException, ParseException, UnknownHostException
    {
        createConnection();
        
        PreparedStatement statement = conn.prepareStatement("INSERT INTO APP.PATIENTS (FNAME, LNAME, AGE, ADDRESS, CITY, ZIP, PHONE, EMAIL,ADDED_BY)"
                + "                                          VALUES(?,?,?,?,?,?,?,?,?)");
        statement.setString(1, fname);
        statement.setString(2, lname);
        statement.setInt(3, age);
        statement.setString(4, address);
        statement.setString(5, city);
        statement.setInt(6, zip);
        statement.setLong(7, phone);
        statement.setString(8, email);
        statement.setString(9,logged);
        
        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0)
        {
            JOptionPane.showMessageDialog(null, "Added new patient with name "+ fname +" successfully.");
        }
        
        if (conn!=null)
            conn.close();
    }
    
    public static void addSpecialist(String fname, String lname, String field, String city, int zip, long phone, String email, String logged) 
                                     throws SQLException, ParseException, UnknownHostException
    {
        createConnection();
        
        PreparedStatement statement = conn.prepareStatement("INSERT INTO APP.SPECIALISTS (FNAME,LNAME,FIELD,CITY,ZIP,PHONE,EMAIL,ADDED_BY)"
                + "                                          VALUES(?,?,?,?,?,?,?,?)");
        statement.setString(1, fname);
        statement.setString(2, lname);
        statement.setString(3, field);
        statement.setString(4, city);
        statement.setInt(5, zip);
        statement.setLong(6, phone);
        statement.setString(7, email);
        statement.setString(8,logged);
        
        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0)
        {
            JOptionPane.showMessageDialog(null, "Added new specialist with name "+ fname +" successfully.");
        }
        
        if (conn!=null)
            conn.close();
    }
    
    public static void addNote(String name, String message, String date, String time, String logged) 
                                     throws SQLException, ParseException, UnknownHostException
    {
        createConnection();
        
        PreparedStatement statement = conn.prepareStatement("INSERT INTO APP.NOTES (NNAME,NMESSAGE,NDATE,NTIME,ADDED_BY)"
                + "                                          VALUES(?,?,?,?,?)");
        statement.setString(1, name);
        statement.setString(2, message);
        statement.setString(3, date);
        statement.setString(4, time);
        statement.setString(5,logged);
        
        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0)
        {
            JOptionPane.showMessageDialog(null, "Added new note titled "+ name +" successfully.");
        }
        
        if (conn!=null)
            conn.close();
    }
    
    public static void addTask(String category, String message, String date, String time, String status, String logged) 
                                       throws SQLException, ParseException, UnknownHostException
    {
        createConnection();
        
        PreparedStatement statement = conn.prepareStatement("INSERT INTO APP.TASKS (TNAME,TMESSAGE,TDUEDATE,TDUETIME,TSTATUS,ADDED_BY)"
                + "                                          VALUES(?,?,?,?,?,?)");
        
        int statusNum = 1;
        switch(status.toLowerCase().trim())
        {
            case "done":       statusNum = 1; break;
            case "not done":   statusNum = 2; break;
            case "pending":    statusNum = 3; break;
        }
        
        statement.setString(1, category);
        statement.setString(2, message);
        statement.setString(3, date);
        statement.setString(4, time);
        statement.setInt(5, statusNum);
        statement.setString(6, logged);
        
        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0)
        {
            JOptionPane.showMessageDialog(null, "Added a new task due on "+ date +" at "+ time +".");
        }
        
        if (conn!=null)
            conn.close();
    }
     
    public static void addConsultation(String patientName, String conditionName, String perscriptionName,
                                       String perscriptionRate, String diagnosis, String consultationDate, String logged) 
                                       throws SQLException, ParseException, UnknownHostException
    {
        createConnection();
        
        String regxParts[] = patientName.split(" ");
        String fname = regxParts[0];
        String lname = regxParts[1];
        
        PreparedStatement statement = conn.prepareStatement("INSERT INTO APP.CONSULTATIONS (CONDITION,DATE,DIAGNOSIS,FNAME,LNAME,PERSCRIPTION,RATE,PATIENT_ID,ADDED_BY)"
                + "                                          VALUES(?,?,?,?,?,?,?,?,?)");
        
        int condition = 100;
        switch(conditionName.toLowerCase().trim())
        {
            case "acceptable":      condition = 50; break;
            case "good":            condition = 75; break;
            case "poor":            condition = 10; break;
            case "critical":        condition = 25; break;
            case "excellent":       condition = 100; break;
        }
        
        statement.setInt(1, condition);
        statement.setString(2, consultationDate);
        statement.setString(3, diagnosis);
        statement.setString(4, fname);
        statement.setString(5, lname);
        statement.setString(6, perscriptionName);
        statement.setString(7, perscriptionRate);
        statement.setInt(8,getUserID(fname,lname));
        statement.setString(9,logged);
        
        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0)
        {
            JOptionPane.showMessageDialog(null, "Added new consultation with patient "+ fname +" successfully.");
        }
        
        if (conn!=null)
            conn.close();
    }
    
    public static int getUserID(String fname, String lname) throws SQLException, UnknownHostException
    {
        createConnection();
        
        PreparedStatement statement = conn.prepareStatement("SELECT * FROM PATIENTS WHERE FNAME = ? AND LNAME = ?");
        statement.setString(1,fname);
        statement.setString(2,lname);
        ResultSet rs = statement.executeQuery();
        int id = 0;
        
        if (!rs.next()) 
        {    

        } 
        
        else
        {
            id = rs.getInt("ID");
        }
        
        if (conn!=null)
            conn.close();
        return id;
    }
    
    public static void newDatabase() throws SQLException, UnknownHostException
    {
        createConnection();
        
        PreparedStatement statement1 = conn.prepareStatement("TRUNCATE TABLE PATIENTS");
        PreparedStatement statement2 = conn.prepareStatement("TRUNCATE TABLE CONSULTATIONS");
        PreparedStatement statement3 = conn.prepareStatement("TRUNCATE TABLE TASKS");
        PreparedStatement statement4 = conn.prepareStatement("TRUNCATE TABLE NOTES");
        PreparedStatement statement5 = conn.prepareStatement("TRUNCATE TABLE SPECIALISTS");
        statement1.executeUpdate();
        statement2.executeUpdate();
        statement3.executeUpdate();
        statement4.executeUpdate();
        statement5.executeUpdate();
        
        if (conn!=null)
            conn.close();
    }
}
