/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.brenner.schroedinger.kapitel_acht.schuhe;

import java.util.Arrays;
import java.util.Collection;

/**
 *
 * @author jonathan
 */
public class SchuhTesterMitArray implements SolcheSchuheHastDuSchonTester{

    private SchuhPaar[] schuhe;
    private int schuhzaehler = 0;
    
    public SchuhTesterMitArray(){
        this.schuhe = new SchuhPaar[20];
    }
    
    @Override
    public void addSchuhPaar(SchuhPaar schuhPaar) {
        if(this.schuhzaehler >= this.schuhe.length){
            schuhe = Arrays.copyOf(this.schuhe, this.schuhe.length + 20);
        }
        if(this.schuhzaehler < this.schuhe.length){
            this.schuhe[schuhzaehler] = schuhPaar;
            this.schuhzaehler++;
        }
    }

    @Override
    public boolean hastDuSchon(SchuhPaar neuesSchuhPaar) {
        boolean hastDuSchon = false;
        for(SchuhPaar schuhPaar : this.schuhe){
            if(schuhPaar != null && schuhPaar.equals(neuesSchuhPaar)){
                hastDuSchon = true;
            }
        }
        return hastDuSchon;
    }
    
    @Override
    public Collection<SchuhPaar> getSchuhKollektion(){
        return Arrays.asList(this.schuhe);
    }
    
}
