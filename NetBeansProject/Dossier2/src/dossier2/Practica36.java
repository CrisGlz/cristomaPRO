/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier2;

import java.util.Scanner;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class Practica36 {
    
    public static void main(String[] args) {
        
    int tirada;
    int suma = 0;
            
    System.out.print("Tirada de tres dados: ");
    
       
    for(int i = 0; i < 3; i++) {
      tirada = (int)(Math.random() * 6) + 1;
      System.out.print(tirada + " ");
      suma += tirada;
      
    }
     
    System.out.println("\nSuma: " + suma);
  }
}
