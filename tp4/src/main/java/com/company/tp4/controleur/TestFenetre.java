/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.company.tp4.controleur;

import com.company.tp4.modele.ModeleFenetre;
import com.company.tp4.vue.MaFenetre;

/**
 *
 * @author amaaradji
 */
public class TestFenetre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ModeleFenetre modelF = new ModeleFenetre();
        modelF.saisirFen();
        
        MaFenetre mf = new MaFenetre(modelF.getLarg(),modelF.getHaut(),modelF.getTitre());
        mf.setVisible(true);
        
        
    }
    
}
