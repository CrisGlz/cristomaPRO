/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier3;

import java.util.Scanner;

/**
 *
 * @author Cris
 */
public class Practica1 {
    
    public static int mcd(int numero1, int numero2) {
        boolean finalizar = false;
        int resultado = 0;
        int dividendo = numero2;
        int divisor = numero1;
        while (!finalizar) {
            int cociente = dividendo / divisor;
            int resto = dividendo % divisor;
            if (resto == 0) {
                resultado = cociente;
                finalizar = true;
            } else {
                dividendo = divisor;
                divisor = resto;
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cálculo de MCD para dos números");
        System.out.print("Número 1: ");
        int num1 = sc.nextInt();
        System.out.print("Número 2: ");
        int num2 = sc.nextInt();
        String solucion = "MCD: " + mcd(num1, num2);
        System.out.println(solucion);
    }
}

