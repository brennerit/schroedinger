/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.brenner.schroedinger.kapitel_10.typisiertresinterfaces;

import java.util.List;

/**
 *
 * @author jonat
 */
public class KopiererMitMethode {
    
        public <T> void kopieren(List<? extends T> quelle, List<? super T> ziel){
           for(int i = 0; i < quelle.size(); i ++){
               ziel.set(i, quelle.get(i));
           }
       }
        
}
