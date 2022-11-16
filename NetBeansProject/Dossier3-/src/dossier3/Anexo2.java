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
public class Anexo2 {
   //MINIMO COMUN DIVISOR
    public static int mcd(int num1, int num2){
       int resultado;
       if(num2==0)
           return num1;
       else
           resultado = mcd(num2, num1%num2);
       return resultado;
   }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dos numeros para saber su MCD media");
        System.out.println("Numero 1: ");
        int num1 = sc.nextInt();
        System.out.println("Numero 2: ");
        int num2 = sc.nextInt();
        System.out.println("El MCD de "+num1+" y "+ num2+" es "+ mcd(num1,num2));
        
        
    }
    
    
}


        
    
