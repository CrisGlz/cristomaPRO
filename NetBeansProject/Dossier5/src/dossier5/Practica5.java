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
public class Practica5 {
       public static void main(String[] args) {
           int n = 7;
           
        int[][] piramide = new int[7][];
        
        int primero = 1;
        for (int i = 0; i < piramide.length; i++) {
           piramide[i]=new int[i+1];
        
           
           int fila[] = new int[i];
           piramide[i]=fila;
           
            for (int j = 0; j < fila.length; j++) {
                fila[j]=primero;
               /* if(fila.length == 2){
                array[i][j] = array[i-1][j-1] + array[i-1][j];
                }*/
            }
            
            
            
        }
        
        for (int[] fila : piramide) {
            for (int dato : fila) {
                System.out.print("\t"+dato);
                
            }
            System.out.println("");
        }
        
        }
    }

