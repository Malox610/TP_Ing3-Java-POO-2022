/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp1;

import java.util.Scanner;

/**
 *
 * @author Superviseur
 */
public class Exercice2 {
    public void method(){
        
        Scanner in = new Scanner (System.in);
        
        boolean positive = true;
        
        int min = Integer.MAX_VALUE, 
                max = 0,
                nb_occ_min = 1,
                nb_occ_max =1;
        
        do {
            int nombre = in.nextInt();
            if (nombre < 0)
                positive = false;
            else {
                if (nombre < min) {
                    min = nombre;
                    nb_occ_min = 1;
                } else 
                    if (nombre == min)
                        nb_occ_min++;
                if (nombre > max){
                    max = nombre;
                    nb_occ_max = 1;
                } else 
                    if (nombre == max)
                        nb_occ_max++;
            }
        } while(positive);
        in.close();
        
        System.out.println("La valeur la plus petite est " + min + ", rencontrée " + nb_occ_min+ " fois,");
        System.out.println("La valeur la plus grande est " + max + ", rencontrée " + nb_occ_max +" fois.");
    }
    
}
