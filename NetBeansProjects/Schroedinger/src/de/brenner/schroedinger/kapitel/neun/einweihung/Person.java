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
public class Person {
    private Firma arbeitetBei;
    private int nettoGehalt;
    
    public Person(Firma arbeitetBei, int nettoGehalt){
        this.arbeitetBei = arbeitetBei;
        this.nettoGehalt = nettoGehalt;
    }
    
    public Firma getArbeitetBei(){
        return this.arbeitetBei;
    }

    public int getNettoGehalt() {
        return this.nettoGehalt;
    }
}
