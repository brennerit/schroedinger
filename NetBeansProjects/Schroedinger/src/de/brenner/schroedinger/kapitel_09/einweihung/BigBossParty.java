/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.brenner.schroedinger.kapitel_09.einweihung;

import java.util.logging.Logger;

/**
 *
 * @author jonathan
 */
public class BigBossParty implements Party{
    
    private static final Logger log = Logger.getLogger(BigBossParty.class.getName());
    
    private Location location;
    
    @Override
    public void setLocation(Location location) {
        this.location = location;
    }
    
    public Location getLocation(){
        return this.location;
    }

    @Override
    public void teilnehmen(Person person) throws NichtEingeladenerTeilnehmerException {
        if(!person.getArbeitetBei().equals(this.getLocation())){
            log.warning( person.getName() + " arbeitet nicht bei " +  this.location);
            throw new NichtEingeladenerTeilnehmerException(person.getName());
        }else if(person.getNettoGehalt() < 40000){
            log.warning(person.getName() + " verdient nicht genug für die Big Boss Party");
            throw new NichtReichGenugException(person.getName());
        }else{
            log.info("Teilnehmer:" + person.getName());
            // person reinlassen
        }
    }
    
    public Logger getLog(){
        return this.log;
    }
}
