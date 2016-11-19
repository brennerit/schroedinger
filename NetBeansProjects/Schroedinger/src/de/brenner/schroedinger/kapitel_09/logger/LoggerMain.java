/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.brenner.schroedinger.kapitel_09.logger;

import java.util.logging.Level;
import java.util.logging.Logger;

import de.brenner.schroedinger.kapitel_09.einweihung.BigBossParty;

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
