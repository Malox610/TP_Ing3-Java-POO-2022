/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp1;

import java.util.Random;

/**
 *
 * @author amaaradji
 */
public class Exercice4 {
    
    int[] tab;
    
    void initialise(){
        
        tab = new int[15];
        
        Random gen = new Random();
        for (int i = 0; i < 15; i++)
            tab[i] = -1 + gen.nextInt(7);
    }
    
    void affiche(){
        System.out.println("tab ---");
        for (int i = 0; i < 15; i++)
            System.out.println(tab[i]);
        System.out.println("---");
    }
    
    void histogramme(){
        int[] histo = new int[7];
        for (int i = 0; i < 15; i++) {
            int index_occ = tab[i]+1;
            histo[index_occ]++;
        }
        for (int i = 0; i < 7; i++) {
            String occ = "";
            for (int j = 0; j < histo[i]; j++)
                occ = occ + "*";
            System.out.print( (i-1) + " " + occ + "  ");
        }
    }
}
