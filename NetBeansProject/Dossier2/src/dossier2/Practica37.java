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


        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantos billetes de 500 tienes?");
        int b500 = sc.nextInt();
        
        total = total + (b500 *500);
        System.out.println("¿Cuantos billetes de 200 tienes?");
        int b200 = sc.nextInt();
        total = total + (b200 *200);
        System.out.println("¿Cuantos billetes de 100 tienes?");
        int b100 = sc.nextInt();
        total = total + (b100 *100);
        System.out.println("¿Cuantos billetes de 50 tienes?");
        int b50 = sc.nextInt();
        total = total + (b50 *50);
        System.out.println("¿Cuantos billetes de 20 tienes?");
        int b20 = sc.nextInt();
        total = total + (b20 *20);
        System.out.println("¿Cuantos billetes de 10 tienes?");
        int b10 = sc.nextInt();
        total = total + (b10 *10);
        System.out.println("¿Cuantos billetes de 5 tienes?");
        int b5 = sc.nextInt();
        total = total + (b5 *5);

        System.out.println("En total tienes: "+total+"€.");

    }

}
