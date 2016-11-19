/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.brenner.schroedinger.kapitel_acht.schuhe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author jonathan
 */
public class MapMain {
    
    public static void main(String [] args){
        mapTesten();
    }
    
    public static void mapTesten(){
        SchuhPaar gleichesSchuhPaar = new SchuhPaar("schwarz", 39, true);
        SovieleSchuheHastDuSchonTester testerMitAnzahl = new SchuhTesterMitMap(
                new ArrayList<SchuhPaar>(),
                new HashMap<SchuhPaar,Integer>()
                );
        testerMitAnzahl.addSchuhPaar(new SchuhPaar("schwarz", 39, true));
        testerMitAnzahl.addSchuhPaar(new SchuhPaar("schwarz", 39, true));
        testerMitAnzahl.addSchuhPaar(new SchuhPaar("schwarz", 39, true));
        testerMitAnzahl.addSchuhPaar(new SchuhPaar("schwarz", 39, true));
        StringBuilder meldung = new StringBuilder();
        meldung.append(testerMitAnzahl.hastDuSchon(gleichesSchuhPaar)
                ? gleichesSchuhPaar + " hast du schon"
                : gleichesSchuhPaar + " hast du noch nicht");
        meldung.append(", und zwar schon " 
                + testerMitAnzahl.sovieleSchuheHastDuSchon(gleichesSchuhPaar)
                + " Stück");
        System.out.println(meldung.toString());
    }
    
    public static void monateTestCode(){
        Map<String, Integer> anzahlTageImMonat = new HashMap<String,Integer>();
        anzahlTageImMonat.put("Januar", 31);
        anzahlTageImMonat.put("Februar", 28);
        anzahlTageImMonat.put("März", 31);
        anzahlTageImMonat.put("April", 30);
        anzahlTageImMonat.put("Mai", 31);
        anzahlTageImMonat.put("Juni", 30);
        anzahlTageImMonat.put("Juli", 31);
        anzahlTageImMonat.put("August", 31);
        anzahlTageImMonat.put("September", 30);
        anzahlTageImMonat.put("Oktober", 31);
        anzahlTageImMonat.put("November", 30);
        anzahlTageImMonat.put("Dezember", 31);
        System.out.println(anzahlTageImMonat.get("Februar"));
        Set<String> alleSchluessel = anzahlTageImMonat.keySet();
        Integer tage = anzahlTageImMonat.remove("Februar");
        Collection<Integer> werte = anzahlTageImMonat.values();
        for(String key: alleSchluessel){
            System.out.println(key + ": " + anzahlTageImMonat.get(key));
        }
    }
}
