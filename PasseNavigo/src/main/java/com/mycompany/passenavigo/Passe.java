/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.passenavigo;

import java.util.ArrayList;

/**
 *
 * @author amaaradji
 */
public abstract class Passe {
    int num;
    String proprio, date_ouverture;
    ArrayList<Operation> histo;

    public Passe(int num, String proprio, String date_ouverture) {
        this.num = num;
        this.proprio = proprio;
        this.date_ouverture = date_ouverture;
        this.histo = new ArrayList<>();
    }

    public ArrayList<Operation> getHisto() {
        return histo;
    }
    
    void historique(int nombreOperations){
        for (int i = histo.size()-1 ; i >= 0 &&  i >= (histo.size() - nombreOperations); i--)
            System.out.println(histo.get(i));
    }
    
    void charger(){};
    void charger(int nb){};
    
    abstract boolean valider(Operation op);
    


}
