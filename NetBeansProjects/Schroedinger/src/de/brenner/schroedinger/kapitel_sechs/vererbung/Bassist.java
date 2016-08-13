/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.brenner.schroedinger.kapitel_sechs.vererbung;

/**
 *
 * @author jonathan
 */
public class Bassist extends Musiker{

    public Bassist(Band band, String kuenstlerName, String vorname, String nachname, int alter) {
        super(band, kuenstlerName, vorname, nachname, alter);
    }
    
    @Override
    public void musizieren(){
        System.out.println("Bass");
    }
}
