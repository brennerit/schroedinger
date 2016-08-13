/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.brenner.schroedinger.kapitel_acht.schuhe;

import java.util.Collection;
import java.util.Map;

/**
 *
 * @author jonathan
 */
public class SchuhTesterMitMap extends SchuhTesterMitCollection implements SovieleSchuheHastDuSchonTester{
    
    private Map<SchuhPaar,Integer> schuhMap;
    
    public SchuhTesterMitMap(Collection<SchuhPaar> schuhKollektion, Map<SchuhPaar,Integer> schuhMap) {
        super(schuhKollektion);
        this.schuhMap = schuhMap;
    }
    
    @Override
    public void addSchuhPaar(SchuhPaar schuhPaar){
        super.addSchuhPaar(schuhPaar);
        Integer anzahlGleicherSchuhe = sovieleSchuheHastDuSchon(schuhPaar);
        this.schuhMap.put(schuhPaar, anzahlGleicherSchuhe + 1);
    }
    
    @Override
    public int sovieleSchuheHastDuSchon(SchuhPaar schuhPaar) {
        Integer anzahl = this.schuhMap.get(schuhPaar);
        return anzahl == null ? 0 : anzahl;
    }
    
}
