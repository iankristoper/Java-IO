
package com.ian.reader;



/*
    File Reader 
*/



import java.io.*;




public class Reader {

    public static void main(String[] args) {
        
        BufferedReader buffReader = null;
        String fileName = "forReading.txt";
        
        try {
            
            buffReader = new BufferedReader(new FileReader(fileName));
            
            String line;
            System.out.println("Reading from the file " + fileName);
            
            //read the file line by line
            while((line = buffReader.readLine()) != null) { 
                
                System.out.println(line);  
                
            }   
            
        } catch(Exception e) {
            
            System.out.println("An error has occured");
            System.out.println(e.getMessage());
            System.out.println("The code ended here!");
            
        }      
    }
}
