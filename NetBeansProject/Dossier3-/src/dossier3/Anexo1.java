/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier3;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class Anexo1 {
    
    public static boolean igualArray(int array[], int array2[], int pos){
        
        boolean resultado;
        resultado = true;
        
        if (array2.length!=array.length){
                resultado = false;
            }else{
            if (pos>= 0){
                if (array[pos]== array2[pos]){
                    if(pos != 0){
                        resultado = igualArray(array, array2, pos -1);                    
                    }else
                        resultado = array[0] == array2[0];                    
                }else{
                    resultado = false;
    }
            }
        }
        return resultado;
    }
    
   
    public static void main(String[] args) {
       
        int array[] = {6, 4, 2, 5, 7};
        int array2[] = {6, 4, 2, 5, 7};
        
        System.out.println(igualArray(array, array2, array.length-1));
    }
    
    
}
