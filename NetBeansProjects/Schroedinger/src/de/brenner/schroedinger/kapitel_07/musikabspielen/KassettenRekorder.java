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
public class KassettenRekorder extends AnalogesMusikAbspielGeraet{

    @Override
    protected boolean unterstuetztTontraeger(Tontraeger tontraeger){
        return tontraeger instanceof Kassette;
    }

    @Override
    protected void einlegen(Tontraeger tontraeger) {
        System.out.println("Aufmachen. Einlegen. Zumachen.");
    }
    
    @Override
    public void abspielen(Tontraeger tontrager){
        super.abspielen(tontrager);
        System.out.println("Och noe, Werbung, Driss, Radioschnitte!");
    }
    
    @Override
    public Kassette auswerfen(){
        return (Kassette) super.auswerfen();
    }
}
