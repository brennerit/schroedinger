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
    
    public NichtEingeladenerTeilnehmerException(){
        super("Teilnehmer nicht eingeladen");
    }
    
    public NichtEingeladenerTeilnehmerException(String exceptionMessage){
        super(exceptionMessage);
    }
}
