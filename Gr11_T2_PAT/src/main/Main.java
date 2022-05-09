/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import GUI.MainGUI;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import objects.*;

/**
 *
 * @author Michael Tomlinson
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        /*LoginSystem us = new LoginSystem();
        us.verifyUser(JOptionPane.showInputDialog("Username"), JOptionPane.showInputDialog("Password"));*/

        MainGUI gui = new MainGUI();
        gui.setVisible(true);
        gui.setResizable(false);
/*            PrintWriter writer5 = new PrintWriter(new FileWriter("CurrentDrive.txt"));

    writer5.flush();
    writer5.close();
        CurrentDrive cDrive = new CurrentDrive();
        cDrive.addAnimal("Zebra", 1);
        cDrive.removeAnimal();
        cDrive.addAnimal("Zebra", 1);
        cDrive.addAnimal("Zebra", 1);
        cDrive.addAnimal("Zebra", 1);
        cDrive.addAnimal("Zebra", 1);
        cDrive.removeAnimal();
        cDrive.addAnimal("Zebra", 1);
DriveManifest saver = new DriveManifest();
saver.saveFile();*/

/*CREATE TABLE "custinf"

(    
   "CUST_ID" INT not null primary key
        GENERATED ALWAYS AS IDENTITY
        (START WITH 1, INCREMENT BY 1),   
   "FNAME" VARCHAR(50),     
   "LNAME" VARCHAR(50),
   "ADDR" VARCHAR(100),
   "SUBURB" VARCHAR(20),
   "PCODE" INTEGER,  
   "PHONE" INTEGER,
   "MOB" INTEGER,    
   "EMAIL" VARCHAR(100),
   "COMM" VARCHAR(450)    
);*/
    }
    
}
