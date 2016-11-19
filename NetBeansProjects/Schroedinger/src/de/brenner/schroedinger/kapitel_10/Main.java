/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.brenner.schroedinger.kapitel_10;

/**
 *
 * @author jonathan
 */
public class Main {
    
    public static void main(String [] args){
        Karton<Integer> karton = new Karton<>(new Integer(2));
        System.out.println(karton.getInhalt());
    }
}
