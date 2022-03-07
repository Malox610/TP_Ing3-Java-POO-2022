/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp5;

/**
 *
 * @author amaaradji
 */
public class PileEntiers extends Pile {
    
    @Override
    public Integer Depiler() throws VideException {
        Integer i = (Integer)super.Depiler();
        return i;
    }
    
    void afficher(){
        maListe.afficher();
    }
}
