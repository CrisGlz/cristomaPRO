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
public class Practica10 {
    
   public static double calcularMedia(int array[]) {
        double suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        return suma / array.length;
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
    }
}