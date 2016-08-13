/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.brenner.schroedinger.heapuebung;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jonathan
 */
public class Crazy {
    
    public static List<Katze> katzenListe = new ArrayList<Katze>() {};
        
    public static void main(String [] args){
        Thread.dumpStack();
    }
    
    public static void makeCats(int number){
        for(int i = 0; i < number;i++){
           katzenListe.add(new Katze("fun" + i, Color.yellow, 5, 10));
        }
    }
    
    public static void waiting(int millis){
        try{
            Thread.sleep(millis);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
