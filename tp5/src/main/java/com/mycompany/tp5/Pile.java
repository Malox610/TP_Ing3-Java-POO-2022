/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp5;

/**
 *
 * @author amaaradji
 */
public class Pile {
    Liste maListe;

    public Pile() {
        maListe = new Liste();
    }
    
    public void Empiler(Object obj){
        maListe.Dernier();
        maListe.Ajouter(obj);
    }
    
    public Object Depiler() throws VideException {
        maListe.Dernier();
        return maListe.Supprimer();
    }
}
