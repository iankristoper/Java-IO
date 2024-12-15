
package com.ian.directoryanalyzer;


/*
    Write a program to analyze a directory
*/

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;



public class DirectoryAnalyzer {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the full path directory: ");
        String fullPath = scanner.nextLine();
        
        File directory = new File(fullPath);
        
        
        //validate the file directory path 
        if(!directory.exists() || !directory.isDirectory()) {
            System.out.println("Invalid directory, Please check and try again");
            scanner.close();
            return;
        }
        
        int totalFiles = 0;
        long totalSize = 0;
        Map<String, Integer> fileTypeCounts = new HashMap<>();
        
        
        //analyze the file directory
        File[] files = directory.listFiles();
        
        if(files != null) {    
            
            for(File copy : files) {    
                
                if(copy.isFile()) {
                    
                    totalFiles++;
                    totalSize += copy.length();
                    
                    //get the file extension
                    String fileName = copy.getName();
                    int lastDotIndex = fileName.lastIndexOf('.');
                    String extension = (lastDotIndex == -1) ? "No Extension" : fileName.substring(lastDotIndex).toLowerCase();
                    
                    //update the file type counts 
                    fileTypeCounts.put(extension, fileTypeCounts.getOrDefault(extension, 0) + 1);
                }
            }
            
        }
        
        // Print the analysis to the console
        System.out.println("Directory Analysis:");
        System.out.println("Total number of files: " + totalFiles);
        System.out.println("Total size of all files: " + totalSize + " bytes");
        
        System.out.println("File type breakdown:");
        for (Map.Entry<String, Integer> entry : fileTypeCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " file(s)");
        }     
        
        // Save the analysis to a report file
        try (FileWriter reportWriter = new FileWriter("analysis_report.txt")) {
            
            reportWriter.write("Directory Analysis Report\n");
            reportWriter.write("Directory: " + fullPath + "\n");
            reportWriter.write("Total number of files: " + totalFiles + "\n");
            reportWriter.write("Total size of all files: " + totalSize + " bytes\n");
            
            reportWriter.write("File type breakdown:\n");       
            for (Map.Entry<String, Integer> entry : fileTypeCounts.entrySet()) {
                reportWriter.write(entry.getKey() + ": " + entry.getValue() + " file(s)\n");
            }
            System.out.println("Analysis saved to analysis_report.txt");
            
        } catch (IOException e) {
            
            System.out.println("An error occurred while saving the report.");
            e.printStackTrace();
            
        }

        scanner.close();      
        
    }
}
