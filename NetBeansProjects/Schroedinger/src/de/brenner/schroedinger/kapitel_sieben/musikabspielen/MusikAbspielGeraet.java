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
public abstract class MusikAbspielGeraet {
 
    private Tontraeger tontraeger;
    
    protected abstract boolean unterstuetztTontraeger(Tontraeger tontraeger);
    protected abstract void einlegen(Tontraeger tontraeger);
    protected abstract void abspielen(Tontraeger tontrager);
   
            
    public final void hoeren(Tontraeger tontraeger){
        if(this.unterstuetztTontraeger(tontraeger)){
            this.tontraeger = tontraeger;
            this.einlegen(tontraeger);
            this.abspielen(tontraeger);
        }else{
            System.err.println(this.getClass().getSimpleName() +  " unterstuetzt " + 
                    tontraeger.getClass().getSimpleName() + " nicht!");
        }
    }
    
    public Tontraeger auswerfen(){
        Tontraeger tontrager = this.tontraeger;
        this.tontraeger = null;
        return tontrager;
    }
}
