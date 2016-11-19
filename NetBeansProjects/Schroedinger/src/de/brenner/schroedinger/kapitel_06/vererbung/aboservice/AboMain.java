/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.brenner.schroedinger.kapitel_06.vererbung.aboservice;

/**
 *
 * @author jonathan
 */
public class AboMain {
       
    public static void main(String [] args){
        Abo abo = new SuperPremiumAbo(new Abonennt(22));
        System.out.println(abo.getPreisProJahr());
    }
}
