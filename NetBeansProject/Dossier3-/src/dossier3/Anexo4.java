/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier3;

import java.util.Scanner;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class Anexo4 {
    
 
    public static int[] subArray (int[] array, int min, int max) {
        int subArray[] = new int[max - min];
        for (int i = 0; i < subArray.length; i++) {
            subArray[i] = array[i + min];
            
        }
        return subArray;
    }
    
    public static boolean comprobarNumero(int[] array, int num) {
        boolean resultado = false;
        if (num == array[0]) {
            resultado = true;
        } else if (array.length > 1) {
            int mitadArray = Math.round(array.length / 2);
            if (num < array[mitadArray]) {
                resultado = comprobarNumero(subArray(array, 0, mitadArray), num);
            }
        }
        return resultado;
    }
    
    
    /*
    public static boolean busquedaRecursiva(int[] array, int posicion) {
        int resultado;
        int posMinima = 0;
        int posMaxima = array.length - 1;
        if (posicion == array.length - 1) {
            resultado = array[posicion];
        } else if (posMinima > posicion){
            posMinima = posicion;
        } else {
            
        }
    }
    */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {3, 7, 11, 23, 44};
        System.out.println("Introduce tu número");
        int num = sc.nextInt();
        System.out.println(comprobarNumero(array, num));
    }
}
