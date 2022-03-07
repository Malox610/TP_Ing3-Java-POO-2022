/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp1;

import java.util.Scanner;

/**
 *
 * @author amaaradji
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("quel est votre choix ");
        Scanner in = new Scanner(System.in);
        int choix = in.nextInt(); 
        if (choix == 1){
            Exercice1 obj1 = new Exercice1();
            obj1.method();
        }
        if (choix == 2){
            Exercice2 obj2 = new Exercice2();
            obj2.method();
        }
        
        if (choix == 3){
            Exercice3 obj3 = new Exercice3();
            obj3.method();
        }
        
        if (choix == 4){
            Exercice4 obj4 = new Exercice4();
            obj4.initialise();
            obj4.affiche();
            obj4.histogramme();
        }
        
        if (choix == 5){
            Exercice5 obj5 = new Exercice5();
            obj5.initialise();
            obj5.affiche();
            obj5.histogramme();
        }
        
        if (choix == 6){
            Exercice6 obj6 = new Exercice6();
            obj6.generateStrongPassword();
        }
    }
    
}
