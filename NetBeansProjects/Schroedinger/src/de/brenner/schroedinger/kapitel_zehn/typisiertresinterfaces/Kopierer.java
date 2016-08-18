/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.brenner.schroedinger.kapitel_zehn.typisiertresinterfaces;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jonat
 */
public class Kopierer<E> {
    private List E;
    
    public void kopieren(List<? extends E> quelle, List<? super E> ziel){
        for(int i = 0; i < quelle.size(); i ++){
            ziel.set(i, quelle.get(i));
        }
    }
    
    public static void main(String []args){
        List<Buch> buecher = new ArrayList<>();
        List<Buch> buecherKopien = new ArrayList<>();
        Kopierer<Buch> buchKopierer = new Kopierer<>();
        buchKopierer.kopieren(buecher,buecherKopien);
        
        List<CD> cds = new ArrayList<>();
        List<CD> cdsKopien = new ArrayList<>();
        Kopierer<CD> cdKopierer = new Kopierer<>();
        cdKopierer.kopieren(cds, cdsKopien);
        
    }
}
