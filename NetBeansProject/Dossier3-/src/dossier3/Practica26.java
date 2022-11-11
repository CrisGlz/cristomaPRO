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
public class Practica26 {
    
        public static int sumarValores(int array[], int posArray) {
        int tam = posArray;
        int suma;
      
        if (tam == 0) {
            return array[tam];
        } else {
            suma = (array[tam]) * sumarValores(array, tam - 1);

        }
        return suma;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos numeros quiere ingresar? en el Array");
        int arr[] = new int[sc.nextInt()];

        System.out.println("Que numeros quieres :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(sumarValores(arr, arr.length - 1));
    }
    }
    
    
    
    
}
