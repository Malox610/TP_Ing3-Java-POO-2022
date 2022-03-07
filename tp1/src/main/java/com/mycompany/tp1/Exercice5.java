/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp1;

import java.util.Scanner;

/**
 *
 * @author amaaradji
 */
public class Exercice5 {
    int[] tab;
    int taille;
    
    void initialise(){
        
        Scanner in = new Scanner (System.in);
        System.out.println("donner la taille du tableau");
        taille = in.nextInt();
        
        tab = new int[taille];
        
        for (int i = 0; i < taille; i++)
            tab[i] = in.nextInt();
    }
    
    void affiche(){
        System.out.println("tab ---");
        for (int i = 0; i < taille; i++)
            System.out.println(tab[i]);
        System.out.println("---");
    }
    
    void histogramme(){
        int[] histo = new int[7];
        for (int i = 0; i < taille; i++) {
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
