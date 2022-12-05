/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examencristo2;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class ExamenCristo2 {

    static int[] intercambio(int array[]){
        
        int min=array[0];
        int max=array[0];
        int aux;
        
        for (int i = 0; i < array.length; i++) {
            if(min>array[i]){
                min=array[i];
            }
           if(max<array[i]){
               max=array[i];
           }
        }
        
        
        
        return array;
    }
    
    
    
    static void mostraryArray(int array[]){
       
        String separador="";
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(separador+array[i]);
            separador=",";
            
        }
               System.out.println("]");
        
        
    }
    
    
    
    public static void main(String[] args) {
        
        int[] array={4, 2, 9, 11, 8, 5};
        
        mostraryArray(array);
    }
    
}
