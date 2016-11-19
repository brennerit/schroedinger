/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.brenner.schroedinger.kapitel_elf.speichernvonobjekten;

import java.io.Serializable;

/**
 *
 * @author jonat
 */
public class TestObjekt implements Serializable{

    private static final long serialVersionUID = 1978150095886654515L;
    
    private int groese;
    private Alter alter;

    public TestObjekt(int groese, Alter alter) {
        this.groese = groese;
        this.alter = alter;
    }

    public int getGroese() {
        return groese;
    }

    public void setGroese(int groese) {
        this.groese = groese;
    }

    public Alter getAlter() {
        return alter;
    }

    public void setAlter(Alter alter) {
        this.alter = alter;
    }

    @Override
    public String toString() {
        return "TestObjekt{" + "groese=" + groese + ", alter=" + alter.getAlter() + '}';
    }
    
}
