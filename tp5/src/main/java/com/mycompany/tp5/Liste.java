/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp5;

import java.util.ArrayList;

/**
 *
 * @author amaaradji
 */
public class Liste {
    private ArrayList<Object> myList = new ArrayList<Object>();
    private int position = -1;
    
    public void Premier(){
        position = 0;
    }
    
    public void Dernier(){
        position = myList.size()-1;
    }
    
    public Object Suivant() throws DernierException{
        Object obj = null;
        position++;
        if (position >= myList.size())
            throw new DernierException();
        else
            obj = myList.get(position);
        return obj;
    }
    
    public Object Supprimer() throws VideException{
        Object obj = null;
        if (myList.isEmpty())
            throw new VideException("Exception Vice");
        else
            obj = myList.remove(position);
        return obj;
    }
    
    public void Ajouter(Object obj){
        //attention: on ajoute à la suite de l'élément sur lequel on est positionné
        myList.add(position+1, obj);
    }

    void afficher() {
        System.out.print(myList);
        System.out.println();
    }
    
}
