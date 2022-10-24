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
public class Practica6 {
 
        static int factorial(double numero) {
        if (numero == 0) {
            return 1;
        } else {
            return (int) (numero * factorial(numero - 1));
        }
    }


public static void main(String[] args) {
       
        Scanner sc = new Scanner (System.in);      
        System.out.println("Dime el numeor del cual quieres obtener le factorial");
        int numero = sc.nextInt();
        System.out.println("EL factorial es: "+ factorial(double numero));
    }
}
    
    
    
    public static void main(String[] args) {
        
    }
    
}
