/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier3;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class Anexo6 {
    
     public static int[] subArray(int posMin, int posMax, int[] array) {
        int arr[] = new int[posMax - posMin + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = array[posMin + i];
        }
        return arr;
    }

    public static int[] ordenarArrayRecursion(int[] array) {

        if (array.length == 2) {
            if (array[0] > array[1]) {
                int aux = array[0];
                array[0] = array[1];
                array[1] = aux;
            }
        } else if (array.length > 2) {
            int mitad = Math.round(array.length / 2);
            int[] arrayIzquierdo;
            int[] arrayDerecho;
            arrayIzquierdo = subArray(0, mitad, array);
            arrayDerecho = subArray(mitad + 1, array.length - 1, array);
            /*
            for (int i = 0; i < mitad; i++) {
                if (arrayIzquierdo[i] < arrayDerecho[i]) {
                    int aux = arrayIzquierdo[i];
                    arrayIzquierdo[i] = arrayDerecho[i];
                    arrayDerecho[i] = aux;
                }
            }
            */
            int i = 0;
            int j = 0;
            int k = 0;
            while (i < arrayIzquierdo.length && j < arrayDerecho.length) {
                if (arrayIzquierdo[i] < arrayDerecho[i]) {
                    array[k] = arrayIzquierdo[i];
                    i++;
                    k++;
                } else {
                    array[k] = arrayDerecho[j];
                }
            }
            if (i > arrayIzquierdo.length) {
                while (k < array.length)
                    array[k] = arrayDerecho[j];
                    k++;
                    j++;
            }
        }

        //[4, 5, 1, 8, 3, 6, 1] ==> [4, 5, 1] [8, 3, 6, 1]
        //[4, 3, 1] [8, 5, 6, 1] ==> [4] [3, 1] [8, 5] [6, 1]
        //[3] [4, 1] [6, 1] [8,5] ==> 
        
        return array;
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 6, 1, 8, 4, 9};
        System.out.println(ordenarArrayRecursion(array));
    }
}

