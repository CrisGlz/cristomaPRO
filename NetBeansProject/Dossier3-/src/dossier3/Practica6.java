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
public class Practica6 {
 
 static double combinacion(int n, int r) {
        double resultado = factorial(n) / (factorial(n-r) * factorial(r));
        return resultado;
    }
    
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
        System.out.println("Introduce el primer número de la combinatoria");
        int numero = sc.nextInt();
        System.out.println("Introduce el segundo número");
        int numero1 = sc.nextInt();
        
        System.out.println(combinacion(numero, numero1));
    }
}
