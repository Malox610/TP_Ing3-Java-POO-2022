/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2;

/**
 *
 * @author amaaradji
 */
public class PileEntiers extends Pile {
    
    @Override
    public Integer Depiler(){
        Integer i = (Integer)super.Depiler();
        return i;
    }
    
    void afficher(){
        maListe.afficher();
    }
}
