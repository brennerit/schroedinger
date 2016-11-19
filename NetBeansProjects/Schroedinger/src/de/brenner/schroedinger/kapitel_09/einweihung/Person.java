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
public class Person {
    private Firma arbeitetBei;
    private int nettoGehalt;
    private String name;
    
    public Person(Firma arbeitetBei, int nettoGehalt, String name){
        this.arbeitetBei = arbeitetBei;
        this.name = name;
        this.nettoGehalt = nettoGehalt;
    }
    
    public Firma getArbeitetBei(){
        return this.arbeitetBei;
    }

    public int getNettoGehalt() {
        return this.nettoGehalt;
    }
    
    public String getName(){
        return this.name;
    }
}
