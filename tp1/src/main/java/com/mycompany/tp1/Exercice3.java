/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp1;

import java.util.Random;

/**
 *
 * @author Superviseur
 */
public class Exercice3 {
    
    int[] tab = new int[6];
    
    public void method(){
        Random gen = new Random();
        int nb = 0;
        
        while (nb <6){
            int nb_alea = 1 + gen.nextInt(49);
            if (!exist( nb_alea)) {
                tab[nb] = nb_alea;
                nb++;
            }
        }
        for ( int i = 0; i <tab.length; i++)
            System.out.println(tab[i]);
    }
    
    boolean exist( int nb_cherch){
        boolean trouv = false;
        for ( int i = 0; i <tab.length && !trouv; i++)
            if (tab[i] == nb_cherch)
                trouv = true;
        return trouv;
    } 
    
}
