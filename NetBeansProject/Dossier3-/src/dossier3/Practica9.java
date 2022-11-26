/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier3;

/**
 *
 * @author Cris
 */
public class Practica9 {
    
       public static void main(String[] args) {
        int size = 10;
        int[] array;
        array = new int[size];
        for (int i = 0; i < size; i++) {
            double dato = 1 + Math.random() * 99;
            if ((int) dato % 2 == 0) {
                for (int j = 0; j < 1; j++) {
                    array[i] = (int) dato;
                    System.out.println(array[i]);
                }
            }
        }
    }
}

