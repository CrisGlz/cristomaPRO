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
public class Anexo2 {
    
   public static int mcdConRecursividad(int num1, int num2) {
        int resultado;
        
        if (num2 == 0) {
            resultado = num1;
        } else {
            resultado = mcdConRecursividad(num1, num2 % num2);
        }
        return resultado;
        
        /*
        int dividendo = num1;
        int divisor = num2;
        int resto = dividendo % divisor;
        if (resto == 0) {
            resultado = divisor;
        } else {
            dividendo = divisor;
            divisor = resto;
            resultado = mcdConRecursividad(dividendo, divisor);
        }
        return resultado;
        */
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo número");
        int num2 = sc.nextInt();
        System.out.println("El mcd de " + num1 + " y " + num2 + " es: " + mcdConRecursividad(num1, num2));
    }
}



        
    
