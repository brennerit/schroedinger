/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.brenner.schroedinger.kapitel_zehn.hundevskatzen;

/**
 *
 * @author jonat
 */
public class Korb<E> {
    
    private E bewohner;
    
    public Korb(){
    
    }

    public E getBewohner() {
        return bewohner;
    }

    public void setBewohner(E bewohner) {
        this.bewohner = bewohner;
    }
    
    
}
