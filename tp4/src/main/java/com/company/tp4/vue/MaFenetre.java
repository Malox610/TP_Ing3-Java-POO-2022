/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.tp4.vue;

/**
 *
 * @author amaaradji
 */
import javax.swing.*;

public class MaFenetre extends JFrame {
     /**
     Constructeur par défaut
     */
     public MaFenetre () { // constructeur
        setSize(300, 150); // donne une taille en hauteur et largeur à la fenêtre
        setTitle("Ma premiere fenetre"); // donne un titre à la fenêtre
    }
    
     public MaFenetre (int largeur, int hauteur, String titre) { // constructeur
        setSize(largeur, hauteur); // donne une taille en hauteur et largeur à la fenêtre
        setTitle(titre); // donne un titre à la fenêtre
    }
     
}
