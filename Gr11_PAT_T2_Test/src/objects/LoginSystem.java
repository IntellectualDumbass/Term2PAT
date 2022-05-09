/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import java.io.File;
import java.io.FileNotFoundException;
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
public class LoginSystem {
String Username, Password, User;
int UserID;
Scanner userRead;
Connection c = null;
Statement s =null;
ResultSet r = null;



    public LoginSystem() {
    }
    public void addUser(String Username, String Password){
        this.Username = Username;
        this.Password = Password;
            try {
            c = DriverManager.getConnection("jdbc:derby://localhost:1527/GameDriveSystem", "Michael", "Tomlinson" );
            s = c.createStatement();
            s.execute("INSERT INTO MICHAEL.USERLIST (USERNAME, USERPASSWORD) VALUES('"+Username+"' ,'"+Password+"')");
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public String verifyUser(String Username, String Password){
        this.Username = Username;
        this.Password = Password;
            try {
            c = DriverManager.getConnection("jdbc:derby://localhost:1527/GameDriveSystem", "Michael", "Tomlinson" );
            s = c.createStatement();
            r = s.executeQuery("SELECT * FROM MICHAEL.USERLIST WHERE USERNAME = '"+Username+"'AND USERPASSWORD = '"+Password+"'");
            if(r.next()!=false){
                return "Permitted";
            }
            else{
                return "Incorrect";
            }
                
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }    
    return null;
    }
}