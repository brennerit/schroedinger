/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.brenner.schroedinger.kapitel_elf.bossingen;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author jonat
 */
public class DatenKonvertierer implements KundenDatenKonvertierer{
    
    public static void main(String [] args){
        DatenKonvertierer dk = new DatenKonvertierer();
        File quelle = new File("bossinger.txt");
        File ziel = new File("bossinger.csv");
        dk.konvertiereKundendaten(quelle, ziel);
    }
    
    @Override
    public void konvertiereKundendaten(File quelle, File ziel) {
        try(BufferedReader reader = new BufferedReader(new FileReader(
                quelle));
            BufferedWriter writer = new BufferedWriter(new FileWriter(
                ziel,true));
        ){
            String zeile;
            while((zeile = reader.readLine()) != null){
                zeile = workWithContent(zeile);
                writer.write(zeile);
            }
        }catch(IOException e){
            
        }
    }

    private String workWithContent(String zeile) {
        String angepassteZeile = "";
        if(zeile.contains(":")){
            String [] content = zeile.split(":");
            angepassteZeile = "," + content[1];
        }else{
            angepassteZeile = "\n";
        }
        System.out.print(angepassteZeile);
        return angepassteZeile;
    }
    
}
