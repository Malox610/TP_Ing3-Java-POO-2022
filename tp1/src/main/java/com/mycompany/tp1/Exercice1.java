/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp1;

/**
 *
 * @author Superviseur
 */
public class Exercice1 {

    public void method() {
        System.out.println("Exo1");
        /*
Identifiez l’erreur 1 et corrigez
         */
//        int i = 0;
//        for (i = 0; i < 5; i++) {
//            System.out.print(i + ", ");
//        }
//        System.out.print("\n");
        /*
Identifiez l’erreur 2 et corrigez
         */
//        float a = (float) 3.0;
//        double b = 4;
//        double c;
//        c = Math.sqrt(a * a + b * b);
//        System.out.println("c = " + c);
        /*
Identifiez l’erreur 3 et corrigez
         */
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        double resultat = (f * b) + (i / c) - (d * s);
        System.out.print((f * b) + " + " + (i / c) + " - " + (d * s));
        System.out.println(" = " + resultat);
        byte b2 = 10;
        int b3 = b2 * b;
        System.out.println("b3 = " + b3);
    }
}

