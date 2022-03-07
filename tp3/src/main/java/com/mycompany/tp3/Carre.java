/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp3;

/**
 *
 * @author amaaradji
 */
public class Carre extends Forme {
    
    double longueur; //longueur

    public Carre() {
        this.longueur = 0;
    }

    public Carre(double l) {
        this.longueur = l;
    }
    
    public Carre(double x, double y, double l) {
        this.x = x;
        this.y = y;
        this.longueur = l;
    }
    
    public Carre(Carre obj){
        this.x = obj.x;
        this.y = obj.y;
        this.longueur = obj.longueur;
    }
    
    
    @Override
    double getSurface() {
        return longueur*longueur;
    }

    @Override
    public String toString() {
        return new String("la longueur du carré est " + longueur); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    double getDistanceOrigine() {
        return Math.sqrt( x*x + y*y );
    }

    
    
    
}
