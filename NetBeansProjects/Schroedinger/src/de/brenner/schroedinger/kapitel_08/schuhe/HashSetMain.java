/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.brenner.schroedinger.kapitel_08.schuhe;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author jonathan
 */
public class HashSetMain {
    public static void main(String [] args){
        Set<Integer> zahlen = new HashSet<>();
        zahlen.add(1);
        zahlen.add(2);
        zahlen.add(3);
        zahlen.add(4);
        System.out.println(zahlen);
        zahlen.add(4);
        System.out.println(zahlen);
    }
}
