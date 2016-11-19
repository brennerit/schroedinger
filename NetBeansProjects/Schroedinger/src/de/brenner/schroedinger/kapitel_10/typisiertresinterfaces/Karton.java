/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.brenner.schroedinger.kapitel_10.typisiertresinterfaces;

/**
 *
 * @author jonat
 */
public class Karton<E> implements Behaelter<E>{
    private E inhalt;

    @Override
    public void setInhalt(E inhalt) {
        this.inhalt = inhalt;
    }

    @Override
    public E getInhalt() {
        return this.inhalt;
    }
    
    
}
