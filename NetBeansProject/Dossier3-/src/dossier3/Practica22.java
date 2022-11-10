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
public class Practica22 {
    
    
    public static int multiplicacion(int num1, int num2){
        
        System.out.println("num1: "+ num1 + " num2: "+ num2);
        int resultado;
       
        
  
        if( num1 == 1)
            resultado = num2;
        else
            resultado = multiplicacion(num1 - 1,num2) + num2;
        return resultado;
                
        
    }
    
    public static void main(String[] args) {
        
       
       Scanner sc = new Scanner (System.in);
        System.out.println("Programa para multiplicar");
        System.out.println("Introduce el primer numero");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo numero");
        int num2 = sc.nextInt();
        
        System.out.println("El resultado de la multiplicacion"+ num1 +" "+num2);
        
    }
}
