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
public class Practica14 {
    
       public static void mostrarArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }
    
    public static int[] ordenarArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int aux = array[i];
                    int numeroMenor = array[j];
                    array[i] = numeroMenor;
                    array[j] = aux;
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

        for (int i = 0; i < 20; i++) {
            int array[] = generarArray(5, 0, 99);
            mostrarArray(array);
            int arrayOrdenado[] = ordenarArray(array);
            mostrarArray(array);
            System.out.println("");
        }
    }
}
    
    

