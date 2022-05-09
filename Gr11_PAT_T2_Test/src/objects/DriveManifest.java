/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Michael Tomlinson
 */
public class DriveManifest {
int numOfDrives;    
String copy = "";
public void saveFile() throws FileNotFoundException, IOException{
Scanner fileCopy = new Scanner(new File("CurrentDrive.txt"));
while(fileCopy.hasNext()){
copy = copy+fileCopy.nextLine()+"\n";
}
Scanner Manifest = new Scanner(new File("DriveManifest.txt"));
if(Manifest.hasNextInt()){
numOfDrives = Manifest.nextInt();}
else{numOfDrives = 0;}
    PrintWriter writer = new PrintWriter(new FileWriter("GameDrive"+(numOfDrives+1)+".txt"));
    writer.write(copy);
    writer.close();
    numOfDrives++;
    PrintWriter ManifestUpdate = new PrintWriter(new FileWriter("DriveManifest.txt"));
    ManifestUpdate.print(numOfDrives);
    ManifestUpdate.close();
    
}

public void reset() throws IOException{
    PrintWriter writer1 = new PrintWriter(new FileWriter("CurrentDrive.txt"));
    writer1.flush();
    writer1.close();
    for(int i =0;i<numOfDrives;i++){
    PrintWriter writer = new PrintWriter(new FileWriter("GameDrive"+(i+1)+".txt"));
    writer.flush();
    writer.close();
        PrintWriter clearer = new PrintWriter(new FileWriter("DriveManifest.txt"));
        clearer.flush();
        clearer.close();
    }
}
}