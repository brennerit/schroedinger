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
public class NichtEingeladenerTeilnehmerException extends Exception{
    
    private String person;
    
    public NichtEingeladenerTeilnehmerException(String person){
        super("Teilnehmer nicht eingeladen");
        this.person = person;
    }
    
    public NichtEingeladenerTeilnehmerException(String exceptionMessage, String person){
        super(exceptionMessage);
        this.person = person;
    }
    
    public String getPerson(){
        return this.person;
    }
}
