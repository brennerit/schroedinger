/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.brenner.schroedinger.kapitel_sechs.vererbung;

/**
 *
 * @author jonathan
 */
public class Proberaum {
    
    public static void main(String [] args){
        Band karotten = new Band("Karotten");
        System.out.println("Proberaum");
        Saenger saenger = new Saenger(karotten, "harald", "Ahmed", "Salame", 22);
        Gitarrist gitarrist = new Gitarrist(karotten, "harald", "Ahmed", "Salame", 22);
        Bassist bassist = new Bassist(karotten, "harald", "Ahmed", "Salame", 22);
        
    }
}
