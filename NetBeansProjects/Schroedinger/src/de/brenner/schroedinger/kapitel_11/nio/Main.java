/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.brenner.schroedinger.kapitel_elf.nio;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jonat
 */
public class Main {
    
    public static void main(String [] args){
            beispielSchreibenMitNIO();
    }
    
    public static void beispiel1(){
        Path ausgabe = Paths.get("D:\\EclipseWorkspaces\\netbeansWorkspace\\schroedinger\\NetBeansProjects\\Schroedinger\\kunden");
        try{
            ausgabe = Files.createDirectory(ausgabe);
            ausgabe = Files.createDirectories(ausgabe);
            Path datei = Files.createFile(ausgabe.resolve("datei.txt"));
        }catch(IOException e){
            
        }
    }
    
    public static void beispiel2() throws IOException{
        Path datei = Paths.get("write.txt");
        System.out.println(datei.toRealPath());
    }
    
    public static void beispielSchreibenMitNIO(){
        int number = 0;
        Path datei = Paths.get("datei.txt");
        Path andereDatei = Paths.get("testDatei.txt");
        try {
            List<String> zeilen = Files.readAllLines(datei);
            andereDatei = Paths.get("testDatei" + number + ".txt");
            number++;
            Files.write(andereDatei, zeilen, StandardCharsets.ISO_8859_1);
            for(String zeile: zeilen){
                andereDatei = Paths.get("testDatei" + number + ".txt");
                Files.write(andereDatei, zeile.getBytes());
                number++;
            }
            Files.copy(datei, andereDatei);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
