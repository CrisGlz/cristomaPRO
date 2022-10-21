/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PruebaALgoritmos;

import java.util.Scanner;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class Pruebadossier3 {

    static int multiplicacion(int num1, int num2) {
        int resultado = num1 * num2;
        return resultado;
    }

    public static void main(String[] args) {
        
        System.out.println("¿Que numero quieres multiplicar?");
        Scanner sc = new Scanner(System.in);
        System.out.println("Primer numero");
        int num1 = sc.nextInt();
        System.out.println("Segundo numero");
        int num2 = sc.nextInt();
       
        System.out.println("El resultado es "+multiplicacion(num1,num2));
        
    }
    
    
}
