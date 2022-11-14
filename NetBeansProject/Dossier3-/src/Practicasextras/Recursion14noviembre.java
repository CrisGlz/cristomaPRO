/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicasextras;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class Recursion14noviembre {
    
    public static int menorRecursion(int array[], int pos){
        
        int resultado;
        if( pos >= array.length -1){
            resultado = array[pos];
        }else{
        int resultadoParcial = menorRecursion(array, pos+1);
        if (array[0] < resultadoParcial){
            resultado = array[0];
        }else{
            resultado =resultadoParcial;  
        }

        }
        return resultado;
    }
    
    
    public static int menorInteractivo(int array[]){
        
        int menor = array[0];
        for (int i = 0; i < array.length; i++) {
            if( menor > array[i]){
                menor = array[i];
            }
            
        }
        return menor;
}
    
    public static void main(String[] args) {
        
        
    }
}


        