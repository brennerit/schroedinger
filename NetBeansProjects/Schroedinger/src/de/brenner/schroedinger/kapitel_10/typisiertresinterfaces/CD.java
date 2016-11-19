/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.brenner.schroedinger.kapitel_zehn.typisiertresinterfaces;

/**
 *
 * @author jonat
 */
public class CD {
    private String title;
    private String autor;
    private int anzahlSongs;

    public CD(String title, String autor, int anzahlSongs) {
        this.title = title;
        this.autor = autor;
        this.anzahlSongs = anzahlSongs;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnzahlSongs() {
        return anzahlSongs;
    }

    public void setAnzahlSongs(int anzahlSongs) {
        this.anzahlSongs = anzahlSongs;
    }
    
    
    
}
