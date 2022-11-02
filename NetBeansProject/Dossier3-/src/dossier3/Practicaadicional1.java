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
    
    
    public static void ordenarArray(int array[]){
        
        int aux = 0;
        
        for (int i = 0; i < array.length; i++) {
            if(array[i] < array[i -1])
            array[i] = aux;
            array[i -1] = array[i];
                
            
            
                }
        System.out.println(mostrarArray[array]+ "");
    }
    
    
    
    
    public static void mostrarArray(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            
        }
               System.out.println("");
    }
    
    
    public static void main(String[] args) {
      
        
        int array[]={3, 7, 1, 6, 9, 4, 5};
        
        mostrarArray(array);
    }
    
}
