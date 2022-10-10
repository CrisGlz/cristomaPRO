/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PruebaALgoritmos;

import java.util.Scanner;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class Practicas10_07 {
    
    public static void main(String[] args) {
        
        System.out.println("Dame tu edad");
        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();
        
       
        if( edad < 18 ){
 
            System.out.println("Es menor de edad");
     
        }else{
            System.out.println("Es mayor de edad");
        }   
    }
    
}
