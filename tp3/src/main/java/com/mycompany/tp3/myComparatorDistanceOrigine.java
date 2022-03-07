/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp3;

import java.util.Comparator;

/**
 *
 * @author amaaradji
 */
public class myComparatorDistanceOrigine implements Comparator<Forme>{

    @Override
    public int compare(Forme o1, Forme o2) {
        if(o1.getDistanceOrigine() == o2.getDistanceOrigine())
            return 0;    
        else if (o1.getDistanceOrigine() > o2.getDistanceOrigine())
            return 1;    
        else    
            return -1;
    }
}