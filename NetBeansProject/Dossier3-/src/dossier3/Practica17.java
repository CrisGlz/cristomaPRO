/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier3;

/**
 *
 * @author Cris
 */
public class Practica17 {
    
        public static void mostrarArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    public static int[] ordenarArray(int[] array) {
        int aux;
        boolean repetirproceso = true;
        int contador = 0;
        for (int i = 0; i < array.length - 1 && repetirproceso; i++) {
            repetirproceso = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] < array[j]) {
                    aux = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = aux;
                    repetirproceso = true;
                }
                contador++;
            }
        }
        System.out.println("hizo " + contador + " iteraciones");
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
        //int[] array = {1, 5, 7, 12, 21, 43, 54, 65, 75, 85};
        //ordenarArray(array);
        
        for (int i = 0; i < 20; i++) {
            int array[] = generarArray(11, 1, 45);
            mostrarArray(array);
            int arrayOrdenado[] = ordenarArray(array);
            mostrarArray(array);
            System.out.println("");
        }
        /*      
        int arrayOrdenado[] = ordenarArray(array);
        mostrarArray(array);
        for (int numero : arrayOrdenado) {
            System.out.print(numero + " ");
        }
        */
    }
}
