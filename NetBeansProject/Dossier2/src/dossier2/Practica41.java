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
public class Practica41 {

    public static void main(String[] args) {
    
    Scanner sc = new Scanner (System.in);
    System.out.println("Dame");
    String palabra = sc.nextLine();
    
    String resultado ="";
        for (int i = palabra.length() - 1; i >0; i--) {
            String str = palabra.substring(i, i+1);
            
            resultado += str;
            System.out.println(resultado);
            
        }
    }

    
       
    
}
