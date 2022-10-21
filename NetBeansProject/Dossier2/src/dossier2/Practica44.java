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
public class Practica44 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero del 1 al 20 para ver su potencia.");
        int num = sc.nextInt();
        int potencia = 1;
        
        if(num<=20 && num>=1){
        for (int i = potencia; i <= 5; i++) {
            potencia = potencia * num;

            System.out.println(num + "^" + i + potencia);
         }
        }else System.out.println("No es un numero del 1 al 20.");

    }

}
