/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.brenner.schroedinger.kapitel.neun.logger;

import de.brenner.schroedinger.kapitel.neun.einweihung.BigBossParty;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jonathan
 */
public class LoggerMain {
    private static final Logger log = Logger.getLogger(BigBossParty.class.getName());
    
    public static void main(String [] args){
        log.log(Level.INFO, "nur ein test");
        
    }
}
