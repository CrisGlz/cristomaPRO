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
        
        System.out.print("|");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " | ");
            
        }
        System.out.println("");

    }

    public static int[] ordenarArray(int array[]){
        int aux ;
        boolean repetirproceso = true;
        for (int i = 0; i < array.length && repetirproceso; i++) {
            repetirproceso = false;
            for (int j = 1; j < (array.length - i); j++) {
                if (array[j - 1] > array[j]) {
                    aux = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = aux;
                    repetirproceso = true;
            }

        }

        }
        return array;
    }
    
    public static int[]generarArray(int size, int liminf, int limsup){
     int array[] = new int[size];
            for (int i = 0; i < array.length; i++) {
                int aleatorio =(int)(Math.random()*(limsup-liminf + 1)+ liminf);
                array[i] = aleatorio;
                
            }
       return array;
    }
    
public static void main(String[] args) {
        int array[]={3, 8, 1, 6, 16, 4, 5};

        mostrarArray(array);
        mostrarArray(ordenarArray(array));




    }
}
