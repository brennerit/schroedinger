/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.brenner.schroedinger.kapitel.neun.einweihung;

/**
 *
 * @author jonathan
 */
public class BossingenEinweihungsParty implements Party{

    private Location location;
    
    @Override
    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public void teilnehmen(Person person) throws NichtEingeladenerTeilnehmerException {
        if(!person.getArbeitetBei().equals(this.getLocation())){
            throw new NichtEingeladenerTeilnehmerException();
        }
    }

    private Location getLocation() {
        return this.location;
    }

    
}
