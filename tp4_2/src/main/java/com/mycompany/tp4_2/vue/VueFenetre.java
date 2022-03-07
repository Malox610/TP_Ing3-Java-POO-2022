/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp4_2.vue;

import com.mycompany.tp4_2.modele.ModeleSouris;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author amaaradji
 */
public class VueFenetre extends JFrame {
    
    
    public VueFenetre(MouseAdapter ma)  {
        addMouseListener(ma);    
    }
    
    public void afficherSouris(int x, int y){
        System.out.println("Coordonées de la souris sont : " + 
                x + ", " + y);
    }

}
