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
public class Pruebadossier3_2 {
    

    static void mostrarTabla(int tabla, int i, int resultado){
        System.out.println("Tabla de: "+ tabla + "*" + i+"="+resultado);
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¿Que numero quieres multiplicar?");
        int num = sc.nextInt();
        for (int i = 1; i <=10; i++) {
            int resultado = num*i;
            mostrarTabla(num,i,resultado);
            
        }
    }
}
