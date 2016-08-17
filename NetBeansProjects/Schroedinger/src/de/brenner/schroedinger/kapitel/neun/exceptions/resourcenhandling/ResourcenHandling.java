/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.brenner.schroedinger.kapitel.neun.exceptions.resourcenhandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author jonathan
 */
public class ResourcenHandling {
    
    public static void main(String[]args){
        System.out.println(newSchoolResourcenHandling());
    }
    
    public static String newSchoolResourcenHandling(){
        StringBuilder inhalt = new StringBuilder();
        File datei = new File("readFile.txt");
        BufferedReader dateileser = null;
        try{
            dateileser = new BufferedReader(new FileReader(datei));
            String zeile = null;
            while((zeile = dateileser.readLine())!=null){
                inhalt.append(zeile);
                inhalt.append(System.getProperty("line.seperator"));
            }
        }catch(FileNotFoundException e){
            System.err.println("file not found");
        }catch(IOException e){
            System.err.println("Io");
        }finally{
            
        }
        return inhalt.toString();
    }
}
