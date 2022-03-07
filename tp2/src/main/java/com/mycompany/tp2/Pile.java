/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2;

/**
 *
 * @author esmil
 */
public class Pile {
   Liste m_Pile;
    
    public Pile()
    {
        m_Pile = new Liste();
    }
    
    public void Empiler(Object obj )
    {//last in
    m_Pile.Dernier();// we set our position in the last place of the queue the lifo principle
    m_Pile.Ajouter(obj); //we add the new object on the position
    
    }
    protected Object Depiler()
    { //first out
    m_Pile.Dernier();//we set our position in the last place of the queue the lifo principle
   return  m_Pile.Supprimer();// we return the object that go off the stack so the last one who get in the stack 
    }
    
}
