/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.brenner.schroedinger.kapitel_07.musikabspielen;

import de.brenner.schroedinger.kapitel_07.musikabspielen.DigitalesMusikAbspielGeraet;

/**
 *
 * @author jonathan
 */
public class CDPlayer extends DigitalesMusikAbspielGeraet{

    @Override
    protected boolean unterstuetztTontraeger(Tontraeger tontraeger) {
        return tontraeger instanceof CD;
    }

    @Override
    protected void einlegen(Tontraeger tontraeger) {
        System.out.println("Aufmachen. Einlegen. Zumach... Ah Falsch eingelegt."
                + "Schnell nochmal auf. Richtig einlegen. Zumachen.");
    }
    
    @Override
    public CD auswerfen(){
        return (CD) super.auswerfen();
    }
    
}
