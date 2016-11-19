/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.brenner.schroedinger.kapitel_11.speichernvonobjekten;

import java.io.Serializable;

/**
 *
 * @author jonat
 */
public class Alter implements Serializable{
    private int alter;
    private static final long serialVersionUID = 1L;
    
    public Alter(int alter) {
        this.alter = alter;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }
    
}
