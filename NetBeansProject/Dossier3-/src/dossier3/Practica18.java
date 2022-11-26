/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier3;

import static dossier3.Practicaadicional1.mostrarArray;
import static dossier3.Practicaadicional1.ordenarArray;
import java.util.Scanner;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class Practica18 {
    
   public static void mostrarArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }
    
    public static void numerosCercanos(int[] array) {
        int menor = (int)Math.abs(array[0] - array[1]); 
        int resta;
        int posicion = 0;
        
        for (int i = 1; i < array.length - 1; i++) {
            resta = (int)Math.abs(array[i] - array[i + 1]);
            if (resta < menor) {
                menor = resta;
                posicion = i;
            }
        }
        System.out.println("Los números más cercanos son: " + array[posicion] + " y " + array[posicion + 1]);
    }

    public static int[] ordenarArray(int[] array) {
        int aux;
        boolean repetirproceso = true;
        for (int i = 0; i < array.length - 1 && repetirproceso; i++) {
            repetirproceso = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] < array[j]) {
                    aux = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = aux;
                    repetirproceso = true;
                }
            }
        }
        return array;
    }

    public static int[] generarArray(int size, int limInf, int limSup) {
        int array[] = new int[size];
        for (int i = 0; i < array.length; i++) {
            int aleatorio = (int) (Math.random() * (limSup - limInf + 1) + limInf);
            array[i] = aleatorio;
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce el " + (i + 1) + "º número");
            array[i] = sc.nextInt();
        }
        numerosCercanos(array);
        
      
    }
}
