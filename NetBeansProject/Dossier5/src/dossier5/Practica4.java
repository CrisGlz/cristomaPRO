/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier5;

/**
 *
 * @author Cristo Manuel Glez Delgado
 */
public class Practica4 {

    public static void main(String[] args) {
        int array[][] = new int[20][];
        int contador = 209;
        for (int i = 0; i < array.length; i++) {
           array[i]=new int[i+1];
        
           
           int fila[] = new int[i];
           array[i]=fila;
           
            for (int j = 0; j < fila.length; j++) {
                fila[j]=contador;
                contador--;
                
            }
            
            
        }
        
        for (int[] fila : array) {
            for (int dato : fila) {
                System.out.print(dato+"\t");
            }
            System.out.println("");
        }
        
        }
    }

