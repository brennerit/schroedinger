/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.brenner.schroedinger.kapitel_05.fotouebung;

/**
 *
 * @author jonathan
 */
public class Fotoaparat {
    
    private static final int MAX_BRENNWEITE = 250;
    private static final int MIN_BRENNWEITE = 18; 
    
    private String marke;
    private int megaPixel;
    private boolean bildStabilisiert;
    private Objektiv objektiv;

    public Fotoaparat(String marke, int megaPixel, Objektiv objektiv, boolean bildStabilisiert) {
        super();
        this.objektiv = objektiv;
        this.marke = marke;
        this.megaPixel = megaPixel;
        this.bildStabilisiert = bildStabilisiert;
    }

    public String getMarke() {
        return marke;
    }

    public int getMegaPixel() {
        return megaPixel;
    }
    public boolean isBildStabilisiert() {
        return bildStabilisiert;
    }
    
    public void setObjektiv(int brennweiteMin, int brennweiteMax){
        this.objektiv = new Objektiv(brennweiteMin, brennweiteMax);
    }
    
    public void setMarke(String marke) {
        this.marke = marke;
    }

    public void setMegaPixel(int megaPixel) {
        this.megaPixel = megaPixel;
    }

    public void setBildStabilisiert(boolean bildStabilisiert) {
        this.bildStabilisiert = bildStabilisiert;
    }

    @Override
    public String toString() {
        return "Fotoaparat{" + "marke=" + marke + ", megaPixel=" + megaPixel 
                + this.objektiv.toString()
                + ", bildStabilisiert=" + bildStabilisiert + '}';
    }
    
    
            
}
