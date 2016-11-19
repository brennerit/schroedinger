/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.brenner.schroedinger.kapitel_05.fotouebung;

/**
 *
 * @author jonathan
 */
public class FotoMain {
    
    public static void main(String [] args){
        Fotoaparat foto = new Fotoaparat("Nikon", 20, new Objektiv(20, 250), true);
        Fotoaparat foto2 = new Fotoaparat("Canon", 40, new Objektiv(10,150), true);
        System.out.println(foto.toString());
        System.out.println(foto2.toString());
    }
    
}
