/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.brenner.schroedinger.kapitel_sieben.musikabspielen;

/**
 *
 * @author jonathan
 */
public abstract class DigitalesMusikAbspielGeraet extends MusikAbspielGeraet{
    
    @Override
    public void abspielen(Tontraeger tontraeger){
        System.out.println("Lass mich raten, dass soll " +  tontraeger.getTitle()
        + " sein. Ist aber ziemlich stark komprimiert!");
    }
}
