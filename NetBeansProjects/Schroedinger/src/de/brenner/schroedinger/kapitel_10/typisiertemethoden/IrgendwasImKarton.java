/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.brenner.schroedinger.kapitel_zehn.typisiertemethoden;

import de.brenner.schroedinger.kapitel_zehn.hundevskatzen.Katze;
import de.brenner.schroedinger.kapitel_zehn.Karton;
import de.brenner.schroedinger.kapitel_zehn.hundevskatzen.Hund;
import de.brenner.schroedinger.kapitel_zehn.hundevskatzen.Tier;
import java.util.List;

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
