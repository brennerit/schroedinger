/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.brenner.schroedinger.kapitel_zehn;

/**
 *
 * @author jonathan
 */
public class Karton<E> {
    
    private E inhalt;
    
    public Karton(E inhalt){
        this.inhalt = inhalt;
    }

    public E getInhalt() {
        return inhalt;
    }

    public void setInhalt(E inhalt) {
        this.inhalt = inhalt;
    }
    
    
}
