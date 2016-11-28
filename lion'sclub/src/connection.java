/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hamid Arain
 */


public class connection {
  public  Statement st;
   public Connection con;
    
    public connection(){
        try {
            Class.forName("sun.jdbc.odbc.jdbcodbcdriver");
            con=DriverManager.getConnection("jdbc:odbc:bridge","sa","arain");
            st=con.createStatement();
            
        } catch (Exception ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }
    
    
}
