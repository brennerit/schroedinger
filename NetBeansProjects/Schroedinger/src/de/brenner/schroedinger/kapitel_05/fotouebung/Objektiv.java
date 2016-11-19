/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.brenner.schroedinger.kapitel_05.fotouebung;

/**
 *
 * @author jonathan
 */
public class Objektiv {
    
    private int brennweiteMin;
    private int brennweiteMax;
    
    public Objektiv(int brennweiteMin, int brennweiteMax){
        this.setBrennweite(brennweiteMin, brennweiteMax);
    }

    public int getBrennweiteMin() {
        return brennweiteMin;
    }

    public int getBrennweiteMax() {
        return brennweiteMax;
    }

    public void setBrennweite(int brennweiteMin, int brennweiteMax) {
        if(brennweiteMin < brennweiteMax){
            this.brennweiteMin = brennweiteMin;
            this.brennweiteMax = brennweiteMax;
        }else{
            //throw fotoexception
        }
    }

    @Override
    public String toString() {
        return " Objektiv{" + "brennweiteMin=" + brennweiteMin + ", brennweiteMax=" + brennweiteMax + '}';
    }
    
    
}
