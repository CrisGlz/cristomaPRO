/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier3;

import java.util.Scanner;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class Practica27 {
    
    
    static int potencias(int n, int m){
        
        int total;
        if(m == 0){
            total = 1;     
        }else if(m == 1){
           total = n;
        }else{
             total = potencias(n,m -1) * n;
                }   
        return total;
    }

        
    public static void main(String[] args) {
        
          Scanner sc = new Scanner(System.in);

        System.out.println("Que numero quieres calcular?");
        int n = sc.nextInt();
        System.out.println("A que potencia??");
        int m = sc.nextInt();    
        System.out.println(potencias(n,m));
    }
    
    
}
