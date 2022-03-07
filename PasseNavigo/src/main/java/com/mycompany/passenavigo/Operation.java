/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.passenavigo;

/**
 *
 * @author amaaradji
 */
public class Operation {
    String date;
    int depart, arrivee;

    public Operation(String date, int dapart, int arrivee) {
        this.date = date;
        this.depart = dapart;
        this.arrivee = arrivee;
    }

    public int getDapart() {
        return depart;
    }

    public int getArrivee() {
        return arrivee;
    }

    @Override
    public String toString() {
        return "date " + date + " de zone " + depart + " à zone " + arrivee ; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
