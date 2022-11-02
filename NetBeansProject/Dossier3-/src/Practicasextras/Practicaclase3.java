/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicasextras;

import java.util.Random;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class Practicaclase3 {
    
        public static void mostrarArray(int arr[]){
    
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +i+" ");
            
        }
        System.out.println("");
    
    }
    
    
    
    public static int aleatorio(int minimo, int maximo) {
        
         Random rnd= new Random();
        
        
        int x = minimo + rnd.nextInt(maximo);
        return x;
    }   
 
    
    public static int[] arrayAleatorio(int size, int minimo, int maximo){
        
        int resultado[] = new int[size];
        for (int i = 0; i < resultado.length; i++) {
            resultado[i] = aleatorio(minimo,maximo);
            
        }
        return resultado;
    }
    
    
    public static void main(String[] args) {
       
        int size = 20;
        int minimo = 1;
        int maximo = 30;
        mostrarArray(arrayAleatorio(size, minimo, maximo));
    }
    
    
}
