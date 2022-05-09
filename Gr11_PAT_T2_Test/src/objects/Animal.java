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
public class Animal {
String Type;
int Quantity;
int AnimalNum;

    public Animal(String Type, int Quantity, int AnimalNum) {
        this.Type = Type;
        this.Quantity = Quantity;
        this.AnimalNum = AnimalNum;
    }


public void writeToDrive()throws IOException {
        PrintWriter writer = new PrintWriter((new FileWriter("CurrentDrive.txt", true)));
                writer.println("&&&&&");
                writer.println(AnimalNum);
                writer.println(Type);
                writer.println(Quantity);
                writer.close();
    }
/*    String typeP;
    int quantityP;
    public Animals(){
    
    }
    //add Animal
    public Animals(String type, int quantity) throws IOException{
        typeP = type;
        quantityP = quantity;
    switch(typeP){
        case "Zebra":{
        addZebra();
        }
        case "Lion":{
        addLion(type, quantity);
        }
        case "Elephant":{
        addElephant(type, quantity);
        }
    }
    }
    public void addZebra() throws IOException{
    writeToDrive();
    }
        public void addLion(String type, int quantity){
    
    }
            public void addElephant(String type, int quantity){
    
    }
            public void writeToDrive()
                 throws IOException {
                int num = 5;
        PrintWriter writer = new PrintWriter((new FileWriter("CurrentGameDrive"+num+".txt")));
                writer.println("*");
                writer.println(typeP);
                writer.println(quantityP);
                writer.close();
    
            }
        
    
*/    
}
