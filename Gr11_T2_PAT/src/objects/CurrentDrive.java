/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import main.Main;

/**
 *
 * @author Michael Tomlinson
 */
public class CurrentDrive {
Connection c = null;
Statement s =null;
ResultSet r = null;
    public CurrentDrive(){
    
    }
  public  void addAnimal(String type, int num) throws IOException{

            try {
            c = DriverManager.getConnection("jdbc:derby://localhost:1527/GameDriveSystem", "Michael", "Tomlinson" );
            s = c.createStatement();
            s.execute("INSERT INTO MICHAEL. (USERNAME, USERPASSWORD) VALUES('"+type+"' ,'"+num+"')");
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
  public  void removeAnimal() throws FileNotFoundException{
            try {
            c = DriverManager.getConnection("jdbc:derby://localhost:1527/GameDriveSystem", "Michael", "Tomlinson" );
            s = c.createStatement();
            s.execute("INSERT INTO MICHAEL. (USERNAME, USERPASSWORD) VALUES('')");
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
