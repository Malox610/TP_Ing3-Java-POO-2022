/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.passenavigo;

import java.util.Scanner;

/**
 *
 * @author amaaradji
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--Création Passe-----------");
        System.out.println("Entrer numéro Passe : ");
        int num = sc.nextInt();
        System.out.println("Entrer type Passe (a/e) : ");
        String type = sc.next();
        System.out.println("Entrer nom proprio : ");
        String proprio = sc.next();
        System.out.println(type + " " + proprio);
        Passe p;
        if (type.equals("a")){
            System.out.println("Entrer zone A : ");
            int a = sc.nextInt();
            System.out.println("Entrer zone B : ");
            int b = sc.nextInt();
            p = new PasseAbonnement(num, proprio, "date", a, b);
        }
        else 
            p = new PasseEasy(num, proprio, "date");
        
        System.out.println("--Rechargement Passe-----------");
        if (type.equals("a"))
            p.charger();
        else {
            System.out.println("Entrer Nb tickets : ");
            int nb = sc.nextInt();
            p.charger(nb);
        }
        
        System.out.println("--Tester Validation d'Opération-----------");
        
        System.out.println("Entrer zone départ : ");
        int dep = sc.nextInt();
        System.out.println("Entrer zone arrivée : ");
        int arr = sc.nextInt();
        
        Operation op = new Operation("date", dep, arr);
        boolean validation= p.valider(op);
        if (validation)
            System.out.println(op + " - operation validée");
        else 
            System.out.println(op + " - operation non-validée");
        
        System.out.println("--Historique :-----------");
        p.historique(3);
        
            
    }
    
}
