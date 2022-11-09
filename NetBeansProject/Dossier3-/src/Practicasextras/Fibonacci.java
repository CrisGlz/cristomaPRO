/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicasextras;

import java.util.Scanner;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class Fibonacci {
    
    public static int fibonacci(int n){
        
        if ( n==1 || n == 2)
            return 1;
        else
            return fibonacci(n-1) + fibonacci(n-2);
        
    }
     
    public static void main(String[] args) {
        
        System.out.println("Inserta un numero");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }
}