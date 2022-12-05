/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier4.Ejercicio8;

import java.util.Scanner;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        
     
           
     do{
         Scanner sc = new Scanner(System.in);
         int opc = sc.nextInt();
         System.out.println("FORMULA DAM1");
         System.out.println("MENU");
         System.out.println("1) Crear coche");
         System.out.println("2) Arrancar Coche");
         System.out.println("3) Apagar Coche");
         System.out.println("4) Finalizar");
       
         
         switch (opc){
             
             case 1:
                 System.out.println("Bienvenido al creador de Coches");
                 System.out.println("¿De que marca va a ser tu coche");
                 String marca = sc.nextLine();
                 Coche coche = new Coche(marca);
                 break;
             
             case 2:
                 
                 String resp = Coche.arrancar();
                 
         }
         
         
     }   
        
     
        
        
    }
 
    
    
}
