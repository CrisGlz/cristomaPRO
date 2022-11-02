/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicasextras;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class Practicaclase2 {
 
    public static int[] copiarArray(int array[]){
        
        int[] copia = new int[array.length]; 
       
        for (int i = 0; i < array.length; i++) {
            copia[i] = array[i];
            
        }
        return copia;
    }
    
    
    public static void mostrarArray(int arr[]){
    
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +i " ");
            
        }
        System.out.println("");
    
    }
    
    
    
    public static void main(String[] args) {
       
        int array[] = { 3, 7, 2, 5, 9};
        
        int[] ca = copiarArray(array);
        
        for (int i = 0; i < ca.length; i++) {
            int maximo = ca[i];
            int pos_maximo = i;
            for (int j = i+1; j < ca.length; j++) {
                if( maximo < ca[j]){
                    maximo = ca[j];
                    pos_maximo = j;
                }
            }
            //maximo = 9
            int aux = ca[i];
            ca[i] = ca[pos_maximo];
            ca[pos_maximo] = aux;
            
        }
        mostrarArray(ca);
    }
    
    
}
