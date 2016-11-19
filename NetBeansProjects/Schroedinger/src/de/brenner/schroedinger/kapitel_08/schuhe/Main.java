/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.brenner.schroedinger.kapitel_08.schuhe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/**
 *
 * @author jonathan
 */
public class Main {
    
    public static void main(String [] args){
        SolcheSchuheHastDuSchonTester tester = new SchuhTesterMitCollection(new TreeSet<SchuhPaar>());
        SchuhPaar schuhPaar  = new SchuhPaar("schwarz", 39, true);
        SchuhPaar schuhPaar2 = new SchuhPaar("lila" , 39, false);
        SchuhPaar schuhPaar3 = new SchuhPaar("gelb", 39 , true);
        SchuhPaar schuhPaar4 = new SchuhPaar("blau", 39 , false);
        
        tester.addSchuhPaar(schuhPaar);
        tester.addSchuhPaar(schuhPaar2);
        tester.addSchuhPaar(schuhPaar3);
        tester.addSchuhPaar(schuhPaar4);
        
        
        SchuhPaar gleichesSchuhPaar = new SchuhPaar("schwarz", 39,true);
        StringBuilder meldung = new StringBuilder();
        meldung.append(tester.hastDuSchon(
                gleichesSchuhPaar) ? 
                        gleichesSchuhPaar + " hast du schon." : gleichesSchuhPaar + "hast du noch nicht.");
        System.out.println(meldung);
        System.out.println(tester.getSchuhKollektion().size());
       /*
        for(SchuhPaar schuh : tester.getSchuhKollektion()){
            System.out.println(schuh.toString());
        }
        */
       Iterator<SchuhPaar> iterator = tester.getSchuhKollektion().iterator();
       while(iterator.hasNext()){
           System.out.println(iterator.next().toString());
       }
       List<SchuhPaar> liste = new ArrayList<>();
       liste.add(schuhPaar);
       liste.add(schuhPaar2);
       liste.add(schuhPaar3);
       liste.add(schuhPaar4);
       System.out.println("Liste: " + liste);
       Collections.sort(liste, new SchuhFarbenComparator());
       System.out.println("Liste: " +  liste);
    }
}