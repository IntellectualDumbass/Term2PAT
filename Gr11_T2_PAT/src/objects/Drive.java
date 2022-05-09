/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;
import main.Main;
import java.text.SimpleDateFormat;

/**
 *
 * @author Michael Tomlinson
 */
public class Drive {
Connection c = null;
Statement s =null;
ResultSet r = null;
String DriveName;
    public Drive(String DriveName) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date(); 
        
        try {
            c = DriverManager.getConnection("jdbc:derby://localhost:1527/GameDriveSystem", "Michael", "Tomlinson" );
            s = c.createStatement();
            s.execute("INSERT INTO MICHAEL.DriveList (DRIVENAME, DATEOFCREATION, USERID) VALUES('"+DriveName+"' ,'"+format.format(date)+"', '"+"')");
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }
}
