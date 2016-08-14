/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.brenner.schroedinger.kapitel.neun.exceptions;

/**
 *
 * @author jonathan
 */
public class MainRuntimeException {
    
    
    public static void main(String [] args){
        System.out.println("Laenger:" + args.length);
        for(String s : args){
            System.out.println(s);
        }
        Integer zahl1 = Integer.parseInt(args[0]);
        Integer zahl2 = Integer.parseInt(args[1]);
        System.out.println((zahl1*zahl2));
    }
}
