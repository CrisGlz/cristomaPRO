/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier2;

import java.util.Scanner;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class Practica37 {

    public static void main(String[] args) {

         int total=0;
        
        int b500 = 0;
        int b200 = 0;
        int b100 = 0;
        int b50 = 0;
        int b20 = 0;
        int b10 = 0;
        int b5 = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantos billetes de 500 tienes?");
        b500 = sc.nextInt();
        
        total = total + (b500 *500);
        System.out.println("¿Cuantos billetes de 200 tienes?");
        b200 = sc.nextInt();
        total = total + (b200 *200);
        System.out.println("¿Cuantos billetes de 100 tienes?");
        b100 = sc.nextInt();
        total = total + (b100 *100);
        System.out.println("¿Cuantos billetes de 50 tienes?");
        b50 = sc.nextInt();
        total = total + (b50 *50);
        System.out.println("¿Cuantos billetes de 20 tienes?");
        b20 = sc.nextInt();
        total = total + (b20 *20);
        System.out.println("¿Cuantos billetes de 10 tienes?");
        b10 = sc.nextInt();
        total = total + (b10 *10);
        System.out.println("¿Cuantos billetes de 5 tienes?");
        b5 = sc.nextInt();
        total = total + (b5 *5);

        System.out.println("En total tienes: "+total+"€.");

    }

}
