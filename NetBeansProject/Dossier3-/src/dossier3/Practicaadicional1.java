/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier3;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class Practicaadicional1 {
    
    
    public static void mostrarArray(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "");

        }
        System.out.println("");

    }

    public static int[] ordenarArray(int array[]){
        int aux ;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (array.length - i); j++) {
                if (array[j - 1] > array[j]) {
                    aux = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = aux;
            }

        }

        }
        return array;
    }
public static void main(String[] args) {
        int array[]={3, 7, 1, 6, 9, 4, 5};

        mostrarArray(array);
        mostrarArray(ordenarArray(array));




    }
}
