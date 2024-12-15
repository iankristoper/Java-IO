package com.ian.contactfilelist;


/*
    Description:
    Create a program to store and retrieve contact information using a text file.
*/


import java.io.*;
import java.util.Scanner;




public class ContactFileList {
    
    public static final String FILE_NAME = "contact.txt";   //contact txt

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        boolean isProgramRunning = true;
        
        
        while(isProgramRunning) {
            
            System.out.println("Contact List");
            System.out.println("[1] Add contact");
            System.out.println("[2] View all contacts");
            System.out.println("[3] Exit");
            
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch(choice) {
                
                case 1:
                    break;
                    
                case 2:
                    break;
                    
                case 3:
                    isProgramRunning = false;
                    break;
                    
                default:
                    System.out.println("Invalid choice, try again");
                    break;                                  
            }
            
            scanner.close();
            
        }
        
    }
    
    public static void addContact(Scanner scanner) {
        
         System.out.print("Enter contact name: ");
         String contactName = scanner.nextLine();
         
         System.out.print("Enter contact number: ");
         String contactNumber = scanner.nextLine();
         
         try {
             
             
             
         }
        
    }
}
