/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.brenner.schroedinger.kapitel_08.schuhe;

import java.util.Comparator;

/**
 *
 * @author jonathan
 */
public class SchuhFarbenComparator implements Comparator<SchuhPaar>{

    @Override
    public int compare(SchuhPaar schuhPaar, SchuhPaar schuhPaar2) {
        int result = 0;
        int groessenVergleich = Integer.valueOf(schuhPaar.getGroesse()).compareTo(schuhPaar2.getGroesse());
        int farbenVergleich = schuhPaar.getFarbe().compareTo(schuhPaar2.getFarbe());
        int stoeckelVergleich = Boolean.valueOf(schuhPaar.isMitStoeckeln()).compareTo(schuhPaar2.isMitStoeckeln());
        if(groessenVergleich != 0){
            result = groessenVergleich;
        } else if(farbenVergleich != 0){
            result = farbenVergleich;
        } else if(stoeckelVergleich != 0){
            result = stoeckelVergleich;
        }
        return result;
    }
    
}
