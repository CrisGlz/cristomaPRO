/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicasextras;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class Practicasextras4 {
    
    public static void unmetodo(int[] arrayRecibido) {
        System.out.println("array recibido: "+ arrayRecibido);
        arrayRecibido[1]=100;
        
    }
    
    public static void main(String[] args) {
       
        int[] array1 = {3, 1, 4};
        System.out.println(array1);
        
        unmetodo(array1);
        
        int[] array3 = array1;
        System.out.println(array3);
        
        
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
            
        }
    }
    
}
