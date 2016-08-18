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
public class KorbMain {
    
    public static void main(String []args){
        Korb<Hund> hundekorb = new Korb<>();
        Korb<Katze> katzenkorb = new Korb<>();
        hundekorb.setBewohner(new Hund());
        Hund hundAusKorb = hundekorb.getBewohner();
        katzenkorb.setBewohner(new Katze());
        Katze katzeAusKorb = katzenkorb.getBewohner();
    }
}
