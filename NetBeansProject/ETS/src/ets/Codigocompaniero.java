/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ets;

import java.util.Scanner;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class Codigocompaniero {
    
    public static void cercania(String palabra, int letra){
        palabra = palabra.toLowerCase();
        
        int distancia = Math.abs(palabra.charAt(0)-letra), pos = 0;
        int distancia2 = Math.abs(palabra.charAt(0)-letra), pos2 = 0;
        char cercana = palabra.charAt(0);
        char cercana2 = palabra.charAt(0);
        
        for (int i = 0; i < palabra.charAt(i-letra); i++) {
            if(Math.abs(palabra.charAt(i)-letra)<distancia){
                distancia = Math.abs(palabra.charAt(i)-letra);
                pos = i;
                cercana = palabra.charAt(i);

            }
            if(Math.abs(palabra.charAt(i)-letra)<distancia2 || cercana == cercana2){
                distancia = Math.abs(palabra.charAt(i)-letra);
                pos2 = i;
                cercana2 = palabra.charAt(i);
            }
        }
        System.out.println(distancia+" "+pos+" "+cercana);
        System.out.println(distancia+" "+pos2+" "+cercana2);
    }
    
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu palabra favorita");
        String palabra = sc.nextLine();
        System.out.println("Ahora dime una letra de esa palabra");
        int letra = 3;
        cercania(palabra, letra);
    }
    
}
