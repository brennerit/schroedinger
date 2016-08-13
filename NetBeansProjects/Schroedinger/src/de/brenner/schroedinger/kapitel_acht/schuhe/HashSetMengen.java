/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.brenner.schroedinger.kapitel_acht.schuhe;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author jonathan
 */
public class HashSetMengen {
    
    public static void main(String [] args){
        aufagbeMengen();
    }
    
    public static void aufagbeMengen(){
        Set<Integer> A = new TreeSet<>();
        for(int i = 1; i <= 40; i++){
            if(i%2==0){
                A.add(i);
            }
        }
        System.out.println("A : " + A);
        Set<Integer> B = new TreeSet<>();
        for(int i = 1; i <= 20; i++){
            if(20%i == 0){
                B.add(i);
            }
        }
        System.out.println("B : " + B);
        
        Set<Integer> D = new TreeSet<>();
        D.addAll(A);
        D.retainAll(B);
        System.out.println("D : " + D);
        
        Set<Integer> C = new TreeSet<>();
        C.addAll(A);
        C.addAll(B);
        C.removeAll(D);
        System.out.println("C : " + C);
       
    }
    
}
