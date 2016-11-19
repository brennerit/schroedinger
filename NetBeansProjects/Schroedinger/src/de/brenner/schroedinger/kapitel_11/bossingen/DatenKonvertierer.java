/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.brenner.schroedinger.kapitel_11.bossingen;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jonat
 */
public class DatenKonvertierer implements KundenDatenKonvertierer{
    
    private static final int ANZAHL_WERTE = 4;
    
    public static void main(String [] args){
        DatenKonvertierer dk = new DatenKonvertierer();
        File quelle = new File("kundendaten");
        File ziel = new File("kundendatencsv");
        dk.konvertiereKundendatenInVerzeichnis(quelle, ziel);
       
    }
    
    @Override
    public void konvertiereKundendaten(File quelle, File ziel) {
        try(BufferedReader reader = new BufferedReader(new FileReader(
                quelle));
            BufferedWriter writer = new BufferedWriter(new FileWriter(
                ziel,true));
        ){
            int zeilenNummer = 0;
            String eingabeZeile;
            while((eingabeZeile = reader.readLine()) != null){
                if(!eingabeZeile.isEmpty()){
                    String ausgabe = eingabeZeile.split(":")[1].trim();
                    if(zeilenNummer%ANZAHL_WERTE <3){
                        ausgabe = ausgabe + ",";
                    }
                    if(zeilenNummer > 0 && zeilenNummer%ANZAHL_WERTE == 0){
                        writer.newLine();
                    }
                    writer.write(ausgabe);
                    zeilenNummer++;
                }
            }
        }catch(IOException e){
            
        }
    }

    public static void printDirectoryFiles(File file){
        if(file.isDirectory()){
            for(File datei : file.listFiles()){
                try{
                    System.out.println(datei.getCanonicalFile());
                }catch(IOException e){
                    
                }
                System.out.println(datei.getName());
                System.out.println(datei.getPath());
                System.out.println(datei.getParent());
            }
        }
    }

    @Override
    public void konvertiereKundendatenInVerzeichnis(File quellVerzeichnis, File zielVerzeichnis) {
        if(zielVerzeichnis != null){
            if( !zielVerzeichnis.exists()){
                zielVerzeichnis.mkdirs();
            }
            FilenameFilter filter = new FilenameFilter() {
                    @Override
                    public boolean accept(File dir, String name) {
                        return name.endsWith(".txt");
                    }
            };
            for( File datei : quellVerzeichnis.listFiles(filter)){
                String zielPfad = zielVerzeichnis.getPath() + File.separator +
                        datei.getName().replace(".txt", ".csv");
                this.konvertiereKundendaten(datei, new File(zielPfad));
            }
        }
        
        
    }

    
    
}
