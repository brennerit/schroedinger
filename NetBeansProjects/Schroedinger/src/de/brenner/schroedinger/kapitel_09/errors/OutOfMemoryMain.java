/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.brenner.schroedinger.kapitel_09.errors;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author jonathan
 */
public class OutOfMemoryMain {
    
    public static void main(String [] args){
        long [] toBigForHeap = new long[Integer.MAX_VALUE];
    }
}
