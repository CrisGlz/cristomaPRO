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
    
 public static int[] copiarsubArray(int array[], int posInicial, int posFinal){
     
     int subarray[]= new int[posFinal-posInicial];
     
     for (int i = 0; i < subarray.length; i++) {
         subarray[i]=array[posInicial + i];
         
         }
     return subarray;
     }
     
 
      
    
    public static int[] ordenarArrayAuxiliar(int array[]){
        
        int mitad = array.length/2;
        
        int arrayIzquierdo[] = copiarsubArray(0,mitad+1, array);
        int arrayDerecho[] = copiarsubArray(mitad,array.length-1, array);
    }
    
    public static void main(String[] args) {
       
        int array[] = {10,5,8,7,3,3,5};
        System.out.println(obtenerMaxArray(array));
    }
    
}
