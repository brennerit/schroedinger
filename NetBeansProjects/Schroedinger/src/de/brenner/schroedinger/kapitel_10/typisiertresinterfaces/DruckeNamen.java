/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.brenner.schroedinger.kapitel_10.typisiertresinterfaces;

import java.util.ArrayList;
import java.util.List;

import de.brenner.schroedinger.kapitel_10.hundevskatzen.Hund;
import de.brenner.schroedinger.kapitel_10.hundevskatzen.Katze;
import de.brenner.schroedinger.kapitel_10.hundevskatzen.Tier;

/**
 *
 * @author jonat
 */
public class DruckeNamen {
    
    public static void main(String []args){
        List<Katze> katzen = new ArrayList<>();
        katzen.add(new Katze("susi0"));
        katzen.add(new Katze("susi1"));
        katzen.add(new Katze("susi2"));
        druckeNamen(katzen);
    }
    
    /**
     * nach oben beschränkte wildcar. nur lesbarer zugriff.
     * @param tiere 
     */
    public static void druckeNamen(List<? extends Tier> tiere){
        for(Tier tier: tiere){
            System.out.println(tier.getName());
        }
    }
    /**
     * Nach unten beschränkte widlcar. schreibbarer zugriff möglich.
     */
    public static void vermehrtEuch(List<? super Tier> tiere){
        tiere.add(new Katze("name"));
        tiere.add(new Hund("name"));
    }
}
