/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier4;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class ArrayDoble {
 
    public static void mostrarArray(int array[][]){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]+"\t");
                
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
       
        int contador = 0;
        int tablero[][] = new int [8][8];
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j]= ++contador;
                
            }
            
            
        }
        
        mostrarArray(tablero);
        
    }
    
}
