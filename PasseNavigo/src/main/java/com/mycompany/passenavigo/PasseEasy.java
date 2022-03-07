/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.passenavigo;

/**
 *
 * @author amaaradji
 */
public class PasseEasy extends Passe {
    int tickets;

    public PasseEasy(int num, String proprio, String date_ouverture) {
        super(num, proprio, date_ouverture);
        this.tickets = tickets;
    }

    public int getTickets() {
        return tickets;
    }
    
    @Override
    void charger(int nb){
        tickets = nb;
    }
    
    @Override
    boolean valider(Operation op){
        if (tickets > 0){
            tickets--;
            histo.add(op);
            return true;
        }
        else 
            return false;
    }
}
