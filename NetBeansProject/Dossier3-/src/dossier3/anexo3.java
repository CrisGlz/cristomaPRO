/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier3;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class anexo3 {
    
    public static int obtenerMaxArray(int array[]){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(max < array[i]){
                max = array[i];
            }
            
        }
        return max;
    }
    
    
    public static int[] ordenarArrayAuxiliar(int array[]){
        
        int auxiliar[] = new int[obtenerMaxArray(array) + 1];
        for (int i = 0; i < array.length; i++) {
            int posicionEnAuxuliar = array[i];
            auxiliar[posicionEnAuxuliar]++; 
            
        }
        return auxiliar;
    }
   
    
     public static void ordenacion(int array[]) {
       
         int[] obtenerArrayAuxiliar = obtenerArrayAuxiliar(array);
  
     }
