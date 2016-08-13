/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.brenner.schroedinger.kapitel.neun.einweihung;

/**
 *
 * @author jonathan
 */
public class Main {
    
    public static void main(String [] args){
        Party party = new BossingenEinweihungsParty();
        Firma kartonBossingen = new Firma("Bossingen Karton");
        Firma baeckereiSchmidt = new Firma("Bäckerei Schmitt");
        
        party.setLocation(kartonBossingen);
        
        try{
            party.teilnehmen(new Person(baeckereiSchmidt,34000));
        }catch(NichtEingeladenerTeilnehmerException e){
            e.printStackTrace();
        }finally{
            System.out.println("sauber machen");
        }
    }
}
