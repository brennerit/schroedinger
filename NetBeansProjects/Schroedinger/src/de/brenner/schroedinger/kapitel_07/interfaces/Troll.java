/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.brenner.schroedinger.kapitel_07.interfaces;

/**
 *
 * @author jonathan
 */
public class Troll extends RollenSpielCharakter implements Monster, Held {

    @Override
    public void bruellen() {
        System.out.println("brullen Troll");
    }

    @Override
    public void heldenhaftPosieren() {
        //Heldenhaft posieren
    }
    
}
