/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier3;

import java.util.Random;

/**
 *
 * @author Cris
 */
public class Practica13 {
    
        public static int[] copiaArray(int array[]) {
        int[] copia = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copia[i] = array[i];
        }
        return copia;
    }

    public static void mostrarArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    public static int aleatorio(int limI, int limS) {
        Random rnd = new Random();
        int aleat = limI + rnd.nextInt(limS - limI + 1);
        return aleat;
    }

    public static int[] generarArrayAleatorio(int size, int limI, int limS) {
        int[] arrayAleatorio = new int[size];
        for (int i = 0; i < arrayAleatorio.length; i++) {
            arrayAleatorio[i] = aleatorio(limI, limS);
        }
        return arrayAleatorio;
    }

    public static void main(String[] args) {
        int[] array = generarArrayAleatorio(20, 0, 100);
        int[] copiaArray = copiaArray(array);
        for (int i = 0; i < copiaArray.length; i++) {
            int minimo = copiaArray[i];
            int pos_minimo = i;
            for (int j = i + 1; j < copiaArray.length; j++) {
                if (minimo > copiaArray[j]) {
                    minimo = copiaArray[j];
                    pos_minimo = j;
                }
            }
            int aux = copiaArray[i];
            copiaArray[i] = copiaArray[pos_minimo];
            copiaArray[pos_minimo] = aux;
        }
        mostrarArray(array);
        mostrarArray(copiaArray);
    }
}


