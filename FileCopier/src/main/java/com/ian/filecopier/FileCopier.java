
package com.ian.filecopier;



/*
    Build a program to copy the contents of one file to another.
*/



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class FileCopier {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the source file path: ");
        String sourceFilePath = scanner.nextLine();
        
        System.out.print("Enter the destination file path: ");
        String destinationPath = scanner.nextLine();
        
        
        BufferedReader buffReader = null;
        BufferedWriter buffWriter = null;
        
        try {
            
            //open a buffered reader to read the file
            buffReader = new BufferedReader(new FileReader(sourceFilePath));
            
            //open a buffered writer to write to the destination file 
            buffWriter = new BufferedWriter(new FileWriter(destinationPath));
            
            
            //read from the source file and write to the destination file
            String line;
            while((line = buffReader.readLine()) != null) {
                
                buffWriter.write(line);     //write each line to the of text to the 
                buffWriter.newLine();
                
            }
            
            System.out.println("File copied successfully");
            
        } catch(Exception e) {
            
            System.out.println("An error has occured");
            System.out.println(e.getMessage());
            
        } finally {
            
            try {
                
                if(buffWriter != null) {
                    buffWriter.close();
                }
                
            } catch(Exception e) {
                
                System.out.println("An error has occured");
                System.out.println(e.getMessage());
                
            }
            
        }
        
    }
}
