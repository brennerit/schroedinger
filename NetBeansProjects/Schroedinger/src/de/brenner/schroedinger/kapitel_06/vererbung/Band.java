/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.brenner.schroedinger.kapitel_sechs.vererbung;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jonathan
 */
public class Band {
    private String bandname;
    private List<Musiker> bandmitglieder = new ArrayList<>();

    public Band(String bandname) {
        this.bandname = bandname;
    }
    
    
    public void addMusiker(Musiker musiker){
        this.bandmitglieder.add(musiker);
    }
    
}
