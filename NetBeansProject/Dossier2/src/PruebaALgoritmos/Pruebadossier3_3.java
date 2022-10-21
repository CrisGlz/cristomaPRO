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
public class Pruebadossier3_3 {

    static int suma(int num1, int num2) {
        int resultado = num1 + num2;
        return resultado;
    }

    static int resta(int num1, int num2) {
        int resultado = num1 - num2;
        return resultado;
    }

    static int multiplicacion(int num1, int num2) {
        int resultado = num1 * num2;
        return resultado;
    }

    static double division(int num1, int num2) {
        int resultado = num1 / num2;
        return resultado;
    }

    public static void main(String[] args) {

        boolean finalizar = false;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Menú:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");

            int opcion = sc.nextInt();
            switch (opcion) {

                case 1:
                    System.out.println("Primer numero");
                    int num1 = sc.nextInt();
                    System.out.println("Segundo numero");
                    int num2 = sc.nextInt();
                    System.out.println("El resultado de la Suma es "+suma(num1,num2));
                    break;
                case 2:
                    System.out.println("Primer numero");
                    int resta1 = sc.nextInt();
                    System.out.println("Segundo numero");
                    int resta2 = sc.nextInt();
                    System.out.println("El resultado de la Resta es "+resta(resta1,resta1));
                    break;
                case 3:
                    System.out.println("Primer numero");
                    int mul1 = sc.nextInt();
                    System.out.println("Segundo numero");
                    int mul2 = sc.nextInt();
                    System.out.println("El resultado de la Suma es "+multiplicacion(mul1,mul2));
                      break;
                case 4:
                    System.out.println("Primer numero");
                    int div1 = sc.nextInt();
                    System.out.println("Segundo numero");
                    int div2 = sc.nextInt();
                    System.out.println("El resultado de la Suma es "+division(div1,div2));                
                      break;
                case 5:
                    finalizar = true;
            }
        }while (finalizar = false);
        
        
    }

}
