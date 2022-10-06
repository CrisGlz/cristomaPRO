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
public class Practica17 {
    
    /*Práctica 17: Crea un programa que calcule el IGIC (7%) de un producto dado su precio de
venta sin IGIC que introduzca el usuario por teclado.*/
    
    public static void main(String[] args) {
        
    Scanner cin = new Scanner(System.in);
    System.out.print("Introducir numero para el IGIC");
    int numero = cin.nextInt();
    final double igic =  0.07;
    double resultado = numero*igic;
    
    System.out.println("El igic de "+numero+" es "+ resultado);
        
        
    }
    
}
