
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
        
        
        
        
        
    }
}
