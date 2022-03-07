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
public class myComparator implements Comparator<Forme>{

    @Override
    public int compare(Forme o1, Forme o2) {
        if(o1.getSurface() == o2.getSurface())
            return 0;    
        else if (o1.getSurface() > o2.getSurface())
            return 1;    
        else    
            return -1;
    }
}