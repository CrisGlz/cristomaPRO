/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicasextras;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class Ejemploexcepcion {
    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un número: ");
        int num=0; 
        boolean esUnNumero = true;
        do{
            
           try{
           num= sc.nextInt();
           esUnNumero = true;
           }catch(InputMismatchException ex){
               //ex.printStackTrace();
               System.out.println("No has dado un numero válido");
               sc.nextLine();
               esUnNumero = false;
           }
        }while (!esUnNumero);    
       System.out.println("El número introducido por dos es: " + (2*num));
                
    }
    
}
