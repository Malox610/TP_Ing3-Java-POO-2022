/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.tp2;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author amaaradji
 */
public class Main {
    public static void main(String[] args){
      PileEntiers P1 = new PileEntiers();
               PileEntiers P2 = new PileEntiers();
               PileEntiers P3 = new PileEntiers();
               PileEntiers P4 = new PileEntiers();
               SecureRandom Rand = new SecureRandom();
               for (int i =0 ;i<5;i++)
               {
                   int nombre =-1;
                   do {
                   nombre =Rand.nextInt();
                   }while(nombre<0);
                   P1.Empiler((int)nombre); // we can also use rand.nextInt or window.crypto.getRandomValues to be more secure to generate a random number and not a pseudo random number
                   //we use max value to get something not out of field for an int 
               }
               //display
        System.out.print("p1 : ");
        P1.afficher();
        System.out.println("");
        
        System.out.print("p2 ");
        P2.afficher();
         System.out.println("");
        
        System.out.print("p3 ");
        P3.afficher();
        System.out.println("");
        
         for (int i =0 ;i<5;i++)
               {
                   P4.Empiler(P1.Depiler());  // we put all the stack into an another stack to keep it 
                    
               }
         
                for (int i = 0; i < 5; i++) {
             int number = P4.Depiler(); //we stack out the stack P1
             P1.Empiler(number); // we re put the P1 stack at the same time as the other to get it at the end the original stack as the same
            if (number % 2 == 0) //even
                P2.Empiler(number);
            else //uneven
                P3.Empiler(number);
            
             System.out.print("p1 : ");
        P1.afficher();
        System.out.println("");
        
        System.out.print("p2 ");
        P2.afficher();
         System.out.println("");
        
        System.out.print("p3 ");
        P3.afficher();
        System.out.println("");
        }
        
         System.out.print("p1 : ");
        P1.afficher();
        System.out.println("");
        
        System.out.print("p2 ");
        P2.afficher();
         System.out.println("");
        
        System.out.print("p3 ");
        P3.afficher();
        System.out.println("");
        
    }
}
