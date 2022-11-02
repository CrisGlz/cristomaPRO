/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicasextras;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class Practicaextra3 {
    
    public static void mostrarArray(int[] array) {
        System.out.print("[ ");
        String coma = "";
        for (int i = 0; i < array.length; i++) {
            System.out.print(coma+array[i]);
            coma = ", ";
            
        }
        System.out.println("]");
    }
    
    public static void main(String[] args) {
       
        int[] arr = {3, 1, 4};
        mostrarArray(arr);
    }
    
}
