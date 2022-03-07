/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.tp4.modele;

import java.util.Scanner;

/**
 *
 * @author amaaradji
 */
public class ModeleFenetre {
    private int larg, haut;
    private String titre;

    public ModeleFenetre() {
       larg = 300;
       haut = 150;
       titre = "Welcome";
    }
    
    public void saisirFen(){
        Scanner s = new Scanner(System.in);
        
        System.out.println("donner la largeur ");
        larg = s.nextInt();
        System.out.println("donner la hauteur ");
        haut = s.nextInt();
        System.out.println("donner le titre ");
        titre = s.next();    
    }

    public int getHaut() {
        return haut;
    }

    public int getLarg() {
        return larg;
    }

    public String getTitre() {
        return titre;
    }
    
    
    


    
}
