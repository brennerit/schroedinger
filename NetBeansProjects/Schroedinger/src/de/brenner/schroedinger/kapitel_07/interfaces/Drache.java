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
public abstract class Drache extends RollenSpielCharakter implements Monster{

    @Override
    public void bruellen() {
        System.out.println("Drache");
    }
    
    public abstract void fliegen();
    public abstract void spucken();
}
