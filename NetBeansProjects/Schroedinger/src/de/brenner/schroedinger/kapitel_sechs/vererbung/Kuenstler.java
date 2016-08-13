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
public class Kuenstler extends Person{
    private String kuenstlerName;

    public Kuenstler(String kuenstlerName, String vorname, String nachname, int alter) {
        super(vorname, nachname, alter);
        this.kuenstlerName = kuenstlerName;
    }
    
    

    public String getKuenstlerName() {
        return kuenstlerName;
    }

    public void setKuenstlerName(String kuenstlerName) {
        this.kuenstlerName = kuenstlerName;
    }
    
}
