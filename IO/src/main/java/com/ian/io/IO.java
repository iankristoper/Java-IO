package com.ian.io;


/*
    This is a simple java io file
*/



import java.io.FileWriter;
import java.io.FileReader;



public class IO {

    public static void main(String[] args) {
        
        try {
            
            //Reading from a file 
            FileReader reader = new FileReader("inputt.txt");
            FileWriter writer = new FileWriter("output2.txt");
            
            int character;
            
            while((character = reader.read()) != -1) {
                writer.write(character);
            }
            
            //closing resources 
            reader.close();
            writer.close();
            
            System.out.println("File content copied successfully!");
        } catch(Exception e) {
            
            System.out.println("An error occurred.");
            System.out.println(e.getMessage());
            
        }
    }
}
