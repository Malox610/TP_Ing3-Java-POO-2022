/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tp3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author amaaradji
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Test fonctionne");
        Carre c1 = new Carre();
        Scanner s = new Scanner(System.in);
        System.out.println("donner la longueur ");
        
        try {
            double longeur = s.nextDouble();
            if (longeur < 0)
                throw new LongNegativeException();
            
            Carre c2 = new Carre(longeur);

            Carre c3 = new Carre(c2);
            
            System.out.println("c1  " + c1.getSurface());
            System.out.println("c2  " + c2.getSurface());
            System.out.println("c3  " + c3.getSurface());
            
            ArrayList<Forme> list = new ArrayList<>();
            list.add(new Carre(7));
            list.add(new Carre(3));
            list.add(new Carre(5));
            
   
            System.out.println(list);
            
            Collections.sort(list);
            
            System.out.println(list);
            
            
            //tri selon Surface
            myComparator comparator = new myComparator();
            
            Collections.sort(list, comparator);
            
            // l'élément avec la plus grande surface est le dernier élement de la liste
            Forme f1 = list.get(list.size()-1); 
            System.out.println(f1.toString());
            
            //tri selon distance de l'origine
            ArrayList<Forme> list2 = new ArrayList<>();
            list2.add(new Carre(0, 0, 7));//coordonnées du centre de la forme 0, 0
            list2.add(new Carre(10, 8, 3));//coordonnées du centre de la forme 10, 8
            list2.add(new Carre(-3, 0, 5));//coordonnées du centre de la forme -3, 0
            
            myComparatorDistanceOrigine comparatorDis = new myComparatorDistanceOrigine();
            Collections.sort(list2, comparatorDis);
            
            // l'élément le plus éloigné de l'origine est le dernier élément de la liste
            Forme f2 = list2.get(list2.size()-1); 
            System.out.println("coordonnées x=" + f2.x + " y=" + f2.y);
            
            
            
            
        } catch (LongNegativeException e) {
            System.out.println(e);
        } 
        catch (Exception e) {
            System.out.println("attention exception");
        }
        
        
    }
    
}
