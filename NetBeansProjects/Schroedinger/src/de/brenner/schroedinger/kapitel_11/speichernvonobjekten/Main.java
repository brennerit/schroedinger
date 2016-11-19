/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.brenner.schroedinger.kapitel_11.speichernvonobjekten;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jonat
 */
public class Main {
    
    public static void main(String []args){
        writeObjekt("objekt.data");
        System.out.println(readObjekt("objekt.data").toString());
    }
    
    public static void writeObjekt(String file){
        TestObjekt obj = new TestObjekt(12, new Alter(11));
        try(
               OutputStream dateiSchreiber = new FileOutputStream(file);
               ObjectOutputStream objektSchreiber = 
                                        new ObjectOutputStream(dateiSchreiber);
            ){
            objektSchreiber.writeObject(obj);
            objektSchreiber.flush();
        }catch (IOException ex) {

        }
    }
    
    public static TestObjekt readObjekt(String file){
        TestObjekt testObjekt = null;
        try(
            InputStream dateiLeser = new FileInputStream(file);
            ObjectInputStream objektLeser = new ObjectInputStream(dateiLeser);
            ){
            testObjekt = (TestObjekt) objektLeser.readObject();
        }catch(IOException e){
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return testObjekt;
    }
}
