package com.ian.userinputio;



/*
    Create a program the writes user input to the text file
*/

import java.io.*;   // * used to import all classes inside this package
import java.util.Scanner; 







public class UserInputIO {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        BufferedWriter buffWriter = null;
        
        
        try {
            
            buffWriter = new BufferedWriter(new FileWriter("fromUserInput2.txt"));
            
            System.out.println("Enter lines of text. Type 'Exit' to finish");
 
            
            //continuously read input from the user 
            String userInput;             
            while(true) {
                
                System.out.print("Enter text here: ");
                userInput = scanner.nextLine();
                
                //exit loop if the user input "Exit"
                if(userInput.equalsIgnoreCase("Exit")) {
                    break;
                }
                
                //write the user input to the file followed by a newline 
                buffWriter.write(userInput + System.lineSeparator());
                
            }    
            
            buffWriter.close();
            System.out.println("Done writing data to the file!");
            
        } catch(Exception e) {
            
            System.out.println("An error has occured");
            System.out.println(e.getMessage());
            
        } 
    }
}






























