/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.brenner.schroedinger.kapitel_09.einweihung;

/**
 *
 * @author jonathan
 */
public class NichtReichGenugException extends NichtEingeladenerTeilnehmerException{

    public NichtReichGenugException(String person) {
        super("Teilnehmer nicht reich genug",person);
    }
    
    
}
