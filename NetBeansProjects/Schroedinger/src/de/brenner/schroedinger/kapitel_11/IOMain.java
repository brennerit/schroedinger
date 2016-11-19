/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.brenner.schroedinger.kapitel_elf;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author jonat
 */
public class IOMain {
    
    public static void main(String [] args){
        writeWithAutoClose();
    }
    
    public static void readWithAutoClose(){
        try(InputStream eingabe = new FileInputStream(new File("readFile.txt"))){
            int eingelesenesByte;
            while((eingelesenesByte = eingabe.read()) != -1){
                System.out.print((char)eingelesenesByte);
            }
        }catch(IOException e){
            
        }
    }
    
    public static void writeWithAutoClose(){
        try(OutputStream ausgabe = new FileOutputStream(new File("write.txt"))){
            ausgabe.write("Hallo Schroedinger\n".getBytes());
        }catch(IOException e){
            
        }
    }
}
