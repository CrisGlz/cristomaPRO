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
public class EJercicio1 {
    
    public static void main(String[] args) {
        
        System.out.println("MUltiplo de que ");
        Scanner sc = new Scanner (System.in);
        
        int multiplo = sc.nextInt();
        System.out.println("¿Dame un limite?");
        int limInf = sc.nextInt();
        int limSup = sc.nextInt();
        
        if (limInf > limSup){
        int temp = limInf;
        limInf = limSup;
        limSup = temp;
    }
        for (int i = limInf; 1 <limSup; i++) {
            if (1 % multiplo == 0)
                System.out.println(i);
        }
        
        
    }
}
