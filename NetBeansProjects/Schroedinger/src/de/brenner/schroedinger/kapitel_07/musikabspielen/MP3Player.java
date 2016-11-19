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
public class MP3Player extends DigitalesMusikAbspielGeraet{

    @Override
    protected boolean unterstuetztTontraeger(Tontraeger tontraeger) {
        return tontraeger instanceof MP3;
    }

    @Override
    protected void einlegen(Tontraeger tontraeger) {
        System.out.println("Was soll das heisen, \"Kann Datei " + tontraeger.getTitle()
        + ".mp3 nicht finden.");
    }
    
    @Override
    public MP3 auswerfen(){
        return (MP3) super.auswerfen();
    }
}
