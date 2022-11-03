/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier3;

import static dossier3.Practicaadicional1.mostrarArray;
import static dossier3.Practicaadicional1.ordenarArray;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class Practica18 {
    
        public static void mostrarArray(int array[]){
        
        System.out.print("|");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " | ");
            
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
        
public static int masCercano(int array[]) { 
  int menorDistanciaActual = Math.abs(num - numeros[0]); // Aca guardas la resta
  int posicionNumeroMasCercano = 0; // Si viene un array con un elemento, es el [0]

  // Empezas en 1, porque ya sabes que el 0 es el mas cercano hasta ahora.
  for (int i = 1; i < numeros.length; i++) {
    int distanciaEntreNumeros = Math.abs(num - numeros[i]);

    if (distanciaEntreNumeros < menorDistanciaActual) {
      menorDistanciaActual = distanciaEntreNumeros;
      posicionNumeroMasCercano = i;
    }
  }

  return numeros[posicionNumeroMasCercano];
}

        
    
    public static void main(String[] args) {
        int array[]={14, 11, 2, 10, 17};


        masCercano(array);
}
    
}
