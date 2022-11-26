/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier3;

import java.util.Scanner;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class Practica5 {

   static double factorial(int numero1) {
        double resultado = 1;
        for (int i = 1; i <= numero1; i++) {
            System.out.println(i);
            resultado *= i;
        }
        return resultado;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número para que se te muestre el factorial de dicho número");
        int numero = sc.nextInt();
        
        System.out.println(factorial(numero));
    }
}