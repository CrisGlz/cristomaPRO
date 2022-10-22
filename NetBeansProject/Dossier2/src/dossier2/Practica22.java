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
public class Practica22 {
    
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = num.nextInt();
        if(numero < 0){
            System.out.println("El numero menor de 0");
        }else if(numero == 0){
            System.out.println("El numero es igual a 0");
        }else if(numero>0 && numero < 10){
            System.out.println("El numero es mayor a 0 y menor a 10");
        }else if(numero==10){
            System.out.println("El numero es mayor a 10");
        }else if(numero>10 && numero<20){
            System.out.println("El numero es mayor a 10 pero menor a 20");
        }else {
            System.out.println("El numero es igual o mayor a 20");
        }
    }
}
    

