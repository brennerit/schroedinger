/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.brenner.schroedinger.kapitel.neun.einweihung;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jonathan
 */
public class NichtEingeladeneTeilnehmerException extends NichtEingeladenerTeilnehmerException{
   
    private static List<String> personen = new ArrayList<>();
    
    public NichtEingeladeneTeilnehmerException() {
        super("");
    }
    
    public void addPerson(String person){
        this.personen.add(person);
    }
    
    public List<String> getPersonList(){
        return this.personen;
    }
}
