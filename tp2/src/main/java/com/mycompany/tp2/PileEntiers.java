/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp2;


/**
 *
 * @author esmil
 */
public class PileEntiers extends Pile{
    // Pile entier is use to cast the object from pile to an integer
    @Override
    public Integer Depiler()
    {
    Integer i=(Integer)super.Depiler() ;
    //we cast the object that return the object and we use the keyword super to call the method Depiler from the mother class Pile 
    return i;
    }      
    
   
    public void afficher()
    {
         m_Pile.afficher();
    }
    
}