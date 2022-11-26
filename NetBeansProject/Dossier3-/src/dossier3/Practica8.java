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
public class Practica8 {
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 10;
        int[] array;
        array = new int[size];
        System.out.println("Introduce 10 números para que se muestre el array");
        for (int i = 0; i < size; i++) {
            int dato = sc.nextInt();
            array[i] = dato;
            System.out.println(array[i]);
        }
    }
}

    

