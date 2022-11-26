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
public class Practica12 {
    
    
     public static double calcularMedia(int array[]) {
        double suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        return suma / array.length;
    }

    public static double varianza(int array[]) {
        double media = calcularMedia(array);

        double suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += (array[i] - media) * (array[i] - media);
        }
        double resultado = suma / array.length;
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos número vas a introducir?");
        int n = sc.nextInt();
        sc.nextLine();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce el numero " + (i + 1));
            int dato = sc.nextInt();
            array[i] = dato;
        }
        System.out.println("La media es: " + calcularMedia(array));
        System.out.println("La varianza es: " + varianza(array));
    }
}
    

