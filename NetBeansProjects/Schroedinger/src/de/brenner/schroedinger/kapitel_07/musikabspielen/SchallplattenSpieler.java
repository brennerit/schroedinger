/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.brenner.schroedinger.kapitel_07.musikabspielen;

/**
 *
 * @author jonathan
 */
public class SchallplattenSpieler extends AnalogesMusikAbspielGeraet{

    @Override
    protected boolean unterstuetztTontraeger(Tontraeger tontraeger) {
        return tontraeger instanceof Schallplatte;
    }

    @Override
    protected void einlegen(Tontraeger tontraeger) {
        System.out.println("Tee zubereiten, ganz gemütlich die Schallplatte aus "
                + "der Hülle nehmen, laaangsam auflegen und vorsichtig mit dem"
                + "Tonabnehmer sein.");
    }
    
    @Override
    public Schallplatte auswerfen(){
        return (Schallplatte) super.auswerfen();
    }
    
}
