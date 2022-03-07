/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tp4_2.controleur;

import com.mycompany.tp4_2.modele.ModeleSouris;
import com.mycompany.tp4_2.vue.VueFenetre;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author amaaradji
 */
public class Clic1  extends MouseAdapter{

    ModeleSouris ms; 
    VueFenetre fen;
    
    @Override
    public void mouseClicked(MouseEvent me) { 
        me.getSource();
        ms = new ModeleSouris(me.getX(), me.getY());
        fen.afficherSouris(ms.getMouse_x(), ms.getMouse_y());
    };
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Clic1 myController = new Clic1();
        
        myController.fen = new VueFenetre(myController);
        myController.fen.setSize(java.lang.Math.abs(500), 150);
        myController.fen.setVisible(true);
        
    }


    
    
    
}
