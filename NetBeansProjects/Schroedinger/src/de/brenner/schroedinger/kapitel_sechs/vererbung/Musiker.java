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
public class Musiker extends Kuenstler{
    private Band band;

    public Musiker(Band band, String kuenstlerName, String vorname, String nachname, int alter) {
        super(kuenstlerName, vorname, nachname, alter);
        this.band = band;
        band.addMusiker(this);
    }
    
    public void musizieren(){
        System.out.println("OO Mmmmmmh,OO Mmmmmmh");
    }

    public Band getBand() {
        return band;
    }

    public void setBand(Band band) {
        this.band = band;
    }
    
}
