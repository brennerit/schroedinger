/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.brenner.schroedinger.kapitel_zehn.typisiertresinterfaces;

import de.brenner.schroedinger.kapitel_acht.schuhe.SchuhPaar;

/**
 *
 * @author jonat
 */
public class SchuhKarton implements Behaelter<SchuhPaar>{
    
    public static void main(String [] args){
        SchuhKarton schuhKarton = new SchuhKarton();
        schuhKarton.setInhalt(new SchuhPaar("gelb", 42, true));
    }
    
    private SchuhPaar schuhpaar;
    @Override
    public void setInhalt(SchuhPaar inhalt) {
        this.schuhpaar = inhalt;
    }

    @Override
    public SchuhPaar getInhalt() {
        return this.schuhpaar;
    }
    
}
