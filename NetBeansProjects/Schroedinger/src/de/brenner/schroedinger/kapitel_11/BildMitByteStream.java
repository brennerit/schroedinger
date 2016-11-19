/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.brenner.schroedinger.kapitel_11;

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
public class BildMitByteStream {
    
    public static void main(String [] args){
        try(
            InputStream eingabe = new FileInputStream(new File("bild.jpg"));
            OutputStream ausgabe = new FileOutputStream(new File("bildKopier.jpg"));
        ){
            int eingelesenesByte;
            while((eingelesenesByte = eingabe.read()) != -1){
                ausgabe.write(eingelesenesByte);
            }
        }catch(IOException e){
            
        }
    }
}
