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
public class Practica18 {
    
    public static void main(String[] args) {
        
        Scanner cin = new Scanner(System.in);
        System.out.println("¿Cuantas horas has trabajo hoy?");
        double numero = cin.nextDouble();
        double pagaTotal = numero*18;
        
        System.out.println("Has cobrado: "+pagaTotal);
        
    }
    
    
}
