/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.brenner.schroedinger.kapitel_10.typisiertemethoden;

import java.util.List;

import de.brenner.schroedinger.kapitel_10.Karton;
import de.brenner.schroedinger.kapitel_10.hundevskatzen.Hund;
import de.brenner.schroedinger.kapitel_10.hundevskatzen.Katze;
import de.brenner.schroedinger.kapitel_10.hundevskatzen.Tier;

/**
 *
 * @author jonat
 */
public class IrgendwasImKarton {
    
    public static void main(String [] args){
        Katze katze = new Katze("Lisa");
        Karton kartonMitKatze = new Karton<>(katze);
        IrgendwasImKarton.<Tier>machWas(kartonMitKatze);
    }
    
    public static <T> void machWas(Karton<? extends T> karton){
        System.out.println("machwas");
    }
    
    public static void machWasMitTierenUndHunden(List<? super Hund> tiere){
        
    }
}
