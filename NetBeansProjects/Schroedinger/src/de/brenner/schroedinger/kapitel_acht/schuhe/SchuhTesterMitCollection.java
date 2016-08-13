/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.brenner.schroedinger.kapitel_acht.schuhe;

import java.util.Collection;

/**
 *
 * @author jonathan
 */
public class SchuhTesterMitCollection implements SolcheSchuheHastDuSchonTester{
    
    private Collection<SchuhPaar> schuhKollektion;
    
    public SchuhTesterMitCollection(Collection<SchuhPaar> schuhKollektion){
        this.schuhKollektion = schuhKollektion;
    }

    public Collection<SchuhPaar> getSchuhKollektion() {
        return schuhKollektion;
    }
    
    @Override
    public void addSchuhPaar(SchuhPaar schuhPaar) {
        this.schuhKollektion.add(schuhPaar);
    }

    @Override
    public boolean hastDuSchon(SchuhPaar schuhPaar) {
        return this.getSchuhKollektion().contains(schuhPaar);
    }
    
    
}
