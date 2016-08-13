/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.brenner.schroedinger.kapitel_sechs.vererbung.aboservice;

/**
 *
 * @author jonathan
 */
public class Abo {
    
    private Abonennt abonennt;

    public Abonennt getAbonennt() {
        return abonennt;
    }

    public void setAbonennt(Abonennt abonennt) {
        this.abonennt = abonennt;
    }
    
    public Abo(Abonennt abonennt){
        this.abonennt = abonennt;
        System.out.println("Neues Abo");
    }
    
    public double getPreisProJahr(){
        return 20.0;
    }
}
