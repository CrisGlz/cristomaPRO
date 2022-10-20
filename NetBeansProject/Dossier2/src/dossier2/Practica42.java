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
public class Practica42 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Dame el dinero a pagar por el encargo");
        int encargo = sc.nextInt();
        
        System.out.println("Dime el numero de trabajadores");
        int trabajadores = sc.nextInt();
        
        int sumaHoras=0;
        for (int i = 0; i<trabajadores; i++) {
            System.out.println("Introduzca las horas de cada uno");
            int hora = sc.nextInt();
            sumaHoras+=hora;
        }
        
        double resultado= encargo/(double)sumaHoras;
        System.out.println("La hora trabajada saldria a "+(double)resultado);
        
    }
            
    
}
