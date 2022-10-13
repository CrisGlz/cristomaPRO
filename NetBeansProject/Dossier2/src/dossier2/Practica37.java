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
public class Practica37 {
    
    public static void main(String[] args) {
       
        
        int b500 = 0;
        int b200 = 0;
        int b100 = 0;
        int b50 = 0;
        int b20 = 0;
        int b10 = 0;
        int b5 = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantos billetes de 500 tienes?");
        b500 = sc.nextInt();
        int t500 = b500 * 500;
        System.out.println("¿Cuantos billetes de 200 tienes?");
        b200 = sc.nextInt();
        
        System.out.println(t500+" y "+b200);
        
        
        
    }
    
}
