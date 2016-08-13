/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.brenner.schroedinger.kapitel_acht.schuhe;

/**
 *
 * @author jonathan
 */
public class SchuhPaar implements Comparable {
    
    private String farbe;
    private int groesse;
    private boolean mitStoeckeln;
    
    public SchuhPaar(String farbe, int groesse, boolean mitStoeckeln){
        this.farbe = farbe;
        this.groesse = groesse;
        this.mitStoeckeln = mitStoeckeln;
    }
    
    public String getFarbe() {
        return farbe;
    }

    public int getGroesse() {
        return groesse;
    }

    public boolean isMitStoeckeln() {
        return mitStoeckeln;
    }
    
    @Override
    public String toString(){
        return this.getGroesse() + " " +  this.getFarbe() + " " 
                + (this.isMitStoeckeln()?" mit Stöckeln" : " ohne Stöckeln" );
    }
    
    
    @Override
    public boolean equals(Object object){
        boolean gleich = false;
        if(object != null && object instanceof SchuhPaar){
            SchuhPaar schuhPaar = (SchuhPaar) object;
            gleich = schuhPaar.mitStoeckeln == this.mitStoeckeln &&
                    schuhPaar.getFarbe().equals(this.getFarbe()) &&
                    schuhPaar.getGroesse() == this.getGroesse();
        }
        return gleich;
    }
    
    @Override
    public int hashCode(){
        return this.getGroesse() + Boolean.hashCode(this.isMitStoeckeln());
    }

    @Override
    public int compareTo(Object o) {
        SchuhPaar schuhPaar = (SchuhPaar) o;
        int result = 0;
        int groessenVergleich = Integer.valueOf(this.getGroesse()).compareTo(schuhPaar.getGroesse());
        int farbenVergleich = this.getFarbe().compareTo(schuhPaar.getFarbe());
        int stoeckelVergleich = Boolean.valueOf(this.isMitStoeckeln()).compareTo(schuhPaar.isMitStoeckeln());
        if(groessenVergleich != 0){
            result = groessenVergleich;
        } else if(farbenVergleich != 0){
            result = farbenVergleich;
        } else if(stoeckelVergleich != 0){
            result = stoeckelVergleich;
        }
        return result;
    }
}
        
