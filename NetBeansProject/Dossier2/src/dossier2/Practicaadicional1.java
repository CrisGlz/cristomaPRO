/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class Practicaadicional1 {
    
    public static void main(String[] args) {
        
        System.out.println("escribe número decimal");
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.UK);
        double numDecimal = sc.nextDouble();
        System.out.println("Has escrito el numero: " + numDecimal);
        
        System.out.println("Dame ahora un numero entero: ");
        int numeroEntero = sc.nextInt();
        System.out.println("El numero entero escrito es "  + numeroEntero);
        
        System.out.println(
                    (int)Math.random() * 100
        );
    
        
        
    }
    
}
