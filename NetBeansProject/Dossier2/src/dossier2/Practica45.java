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
public class Practica45 {

    public static void main(String[] args) {
       

        
        Scanner sc = new Scanner (System.in); 
        System.out.println("Introduce el numero a descomponer");
        int num1 = sc.nextInt();
        int copia = num1;
                
        for (int i =2; copia >= i; i++) {
            int contadorPotencia = 0;
            while (copia % 1 == 0){
                contadorPotencia++;
                copia = copia / i;
                System.out.println(copia + " | "+ i);
            }
            }
        
    }
    
}
