/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.tp2;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author amaaradji
 */
public class Main {
    public static void main(String[] args){
        PileEntiers 
                p1 = new PileEntiers(),
                p2 = new PileEntiers(), 
                p3 = new PileEntiers(),
                p_intermediare = new PileEntiers();
        
        //initialisation
        for (int i = 0; i < 10; i++)
            p1.Empiler((int) (Math.random()*100));
        
        // affichage
        System.out.print("p1 ");
        p1.afficher();
        
        System.out.print("p2 ");
        p3.afficher();
        
        System.out.print("p3 ");
        p3.afficher();
        
        //1- depiler dans une pile intermediaire
        for (int i = 0; i < 10; i++) //pour retourver (plus loin) les élements dans le meme ordre que dans 1
            p_intermediare.Empiler(p1.Depiler());
        
        //2- empiler ensuite en vérifiant si pair
        for (int i = 0; i < 10; i++) {
            int elem = p_intermediare.Depiler();
            p1.Empiler(elem);
            if (elem % 2 == 0) //pair
                p2.Empiler(elem);
            else //impair
                p3.Empiler(elem);
        }
        
        //affichage
        System.out.print("p1 ");
        p1.afficher();
        
        System.out.print("p2 ");
        p2.afficher();
        
        System.out.print("p3 ");
        p3.afficher();
        
    }
}
