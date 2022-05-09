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
import java.sql.Date;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import main.Main;

/**
 *
 * @author Michael Tomlinson
 */
public class AddDriveFunction {
    String driveName, description;
    int UserID;
    Connection c = null;
Statement s =null;
ResultSet r = null;

    public AddDriveFunction(String driveName, String description, int USERID) {
        this.driveName = driveName;
        this.description = description;
        this.UserID = USERID;
    }
    public void AddDrive(){
java.util.Date date = new java.util.Date();
java.sql.Date sqlDate = new java.sql.Date(date.getTime());
                try {
            c = DriverManager.getConnection("jdbc:derby://localhost:1527/GameDriveSystem", "Michael", "Tomlinson" );
            s = c.createStatement();
            s.execute("INSERT INTO MICHAEL.DRIVELIST (DRIVENAME, DRIVEDESCRIPTION, DATEOFCREATION, USER_ID) VALUES('"+driveName+"' ,'"+description+"','"+sqlDate+"','"+UserID+")");
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
