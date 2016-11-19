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
public class SuperPremiumAbo extends PremiumAbo{
    
    public SuperPremiumAbo(Abonennt abonennt){
        super(abonennt);
        System.out.println("Neues Super Presmium Abo");
    }
    
    @Override
    public double getPreisProJahr(){
        return super.getPreisProJahr()*2;
    }
}
