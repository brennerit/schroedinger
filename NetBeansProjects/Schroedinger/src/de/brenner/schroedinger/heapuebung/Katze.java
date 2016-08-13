/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.brenner.schroedinger.heapuebung;

import java.awt.Color;

/**
 *
 * @author jonathan
 */
public class Katze {
        private String name;
        private Color color;
        private int age;
        private int size;

    public Katze(String name, Color color, int age, int size) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.size = size;
    }
   
    public void growOld(){
        age++;
    }

    @Override
    public String toString() {
        return "Katze{" + "name=" + name + ", color=" + color + ", age=" + age + ", size=" + size + '}';
    }
    
    
        
}
