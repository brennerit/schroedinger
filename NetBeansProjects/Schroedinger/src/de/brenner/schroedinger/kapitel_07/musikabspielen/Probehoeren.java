/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.brenner.schroedinger.kapitel_07.musikabspielen;

/**
 *
 * @author jonathan
 */
public class Probehoeren {
    
    public static void main(String [] args){
   
        MusikAbspielGeraet schallplattenSpieler = new SchallplattenSpieler();
        schallplattenSpieler.hoeren(new LP("Jimi Hendrix"));
        MusikAbspielGeraet cdPlayer = new CDPlayer();
        cdPlayer.hoeren(new LP("Jimi Hendrix"));
        cdPlayer.hoeren(new CD("Jimi Hendrix"));
        MusikAbspielGeraet mp3Player = new MP3Player();
        mp3Player.hoeren(new MP3("Jimi Hendrix"));
        MusikAbspielGeraet kassettenrekorder = new KassettenRekorder();
        kassettenrekorder.hoeren(new Kassette("Jimi Hendrix"));
    }
}
