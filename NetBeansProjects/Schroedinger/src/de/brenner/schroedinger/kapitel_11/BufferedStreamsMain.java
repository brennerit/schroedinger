/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.brenner.schroedinger.kapitel_11;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author jonat
 */
public class BufferedStreamsMain {
    
    public static void main(String [] args){
        writeBuffered();
        CharStreamBuffered();
    }
    
    public static void buffered(){
        try(
        BufferedInputStream eingabe = new BufferedInputStream(new FileInputStream
        (new File("bild.jpg")));
        BufferedOutputStream ausgabe = new BufferedOutputStream(new FileOutputStream
        (new File("copyBild.jpg")));        
        ){
            byte[] buffer = new byte[1024];
            while(eingabe.read(buffer) != -1){
                ausgabe.write(buffer);
            }
        }catch(IOException e){
                
        }
    }
    
    public static void CharStream(){
        try(FileReader fileReader = new FileReader(new File("readFile.txt"))){
            int eingelesenByte;
            while((eingelesenByte = fileReader.read())!= -1){
                System.out.print((char) eingelesenByte);
            }
        }catch(IOException e){
            
        }
    }
    
    public static void CharStreamBuffered(){
        try(BufferedReader reader = new BufferedReader(new FileReader(
                new File("readFile.txt")))
        ){
            String zeile;
            while((zeile = reader.readLine())!=null){
                System.out.println(zeile);
            }
        }catch(IOException e){
            
        }
    }
    
    public static void writeBuffered(){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(
        new File("readFile.txt"),true))
        ){
            writer.write("Neue Text");
        }catch(IOException e){
            
        }
    }
}
