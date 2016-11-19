/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.brenner.schroedinger.kapitel_09.einweihung;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jonathan
 */
public class Main {
    
    public static void main(String [] args){
        try{
            partyStarten();
        }catch(NichtEingeladeneTeilnehmerException e){
            System.err.println(e.getPersonList() + " verdienen nicht genug");
        }
    }
    
    public static void bigBossParty(){
        Party party = new BigBossParty();
        Firma kartonBossingen = new Firma("Bossingen Karton");
        Firma baeckereiSchmidt = new Firma("Bäckerei Schmitt");
        
        party.setLocation(kartonBossingen);
        
        try{
            party.teilnehmen(new Person(baeckereiSchmidt,34000,"WOlfi"));
        }catch(NichtEingeladenerTeilnehmerException e){
            System.err.println(e.getPerson() + " verdient nicht genug "
                    + "für diese BigBossParty.");
        }finally{
            System.out.println("sauber machen");
        }
    }
    
    public static void partyStarten()throws NichtEingeladeneTeilnehmerException{
        NichtEingeladeneTeilnehmerException  ePersonen = new NichtEingeladeneTeilnehmerException();
        Party party = new BigBossParty();
        
        Firma mueller = new Firma("Firam Mueller");
        Firma dalferth = new Firma("Schmiede Dalferth");
        
        party.setLocation(mueller);
        
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(mueller, 14000, "Hans Maulwurf"));
        personList.add(new Person(mueller, 28000, "Peter Maulwurf"));
        personList.add(new Person(dalferth, 42000, "Manni Maulwurf"));
        personList.add(new Person(mueller, 44000, "Susi Maulwurf"));
        personList.add(new Person(mueller, 70000, "Chef Maulwurf"));
        for(Person person: personList){
            try{
                party.teilnehmen(person);
            }catch(NichtEingeladenerTeilnehmerException e){
                ePersonen.addPerson(person.getName());
            }
        }
        throw ePersonen;
    }
}
