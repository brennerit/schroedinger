/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.brenner.schroedinger.kapitel_zehn.typisiertresinterfaces;

/**
 *
 * @author jonat
 */
public interface Behaelter<E> {
    
    void setInhalt(E inhalt);
    E getInhalt();
}
