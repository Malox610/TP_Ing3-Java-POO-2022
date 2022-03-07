/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.passenavigo;

/**
 *
 * @author amaaradji
 */
public class PasseAbonnement extends Passe {
    int Zone_A, Zone_B;
    boolean activ;

    public PasseAbonnement(int num, String proprio, String date_ouverture, int Zone_A, int Zone_B) {
        super(num, proprio, date_ouverture);
        this.Zone_A = Zone_A;
        this.Zone_B = Zone_B;
        this.activ = activ;
    }
    
    @Override
    void charger(){
        activ = true;
    }
    
    @Override
    boolean valider(Operation op){
        if ( Zone_A <= op.depart && op.depart <= Zone_B && Zone_A <= op.arrivee && op.arrivee <= Zone_B ){
            histo.add(op);
            return true;
        }
        else 
            return false;
    }
    
}
