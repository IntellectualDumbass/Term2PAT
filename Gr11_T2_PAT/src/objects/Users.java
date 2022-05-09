/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Michael Tomlinson
 */
public class Users {
String Username, Password;
int UserID = 0;
PrintWriter userEdit;


public void addUser(String Username, String Password) throws IOException{
userEdit = new PrintWriter(new FileWriter("Users.txt", true));
userEdit.println("&&&&&");
userEdit.println(UserID);
userEdit.println(Username);
userEdit.println(Password);
userEdit.close();
}
}
