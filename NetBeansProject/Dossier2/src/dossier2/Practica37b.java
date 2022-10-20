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
public class Practica37b {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("¿Que cantidad quieres ingresar?");
        
        int cantidad = sc.nextInt();
        
        int cantidadBilletes = 0;
        
        for (int j= 100; j >= 1; j /= 10){
            for (int i = 5; i >= 1; i /= 2){
                
                int billete = i * j;
                cantidadBilletes = cantidad / billete;
                cantidad %= billete;
                if (cantidadBilletes >0)
                    System.out.println("Tienes "+ cantidadBilletes  + " Billetes de "+ billete+".");
                
            }

        }    
    }
}