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
public class AboPreisBerechner {
    
    public double getAboPreis(Abo abo){
        double preis = 0;
        if(abo instanceof SuperPremiumAbo){
            if(abo.getAbonennt().getAlter() < 18){
                preis = 0.5 * abo.getPreisProJahr();
            }
        }else if(abo instanceof PremiumAbo){
            if(abo.getAbonennt().getAlter() < 18){
                preis = 0.25 * abo.getPreisProJahr();
            }
        }else{
            preis = abo.getPreisProJahr();
        }
        return preis;
    }

}
