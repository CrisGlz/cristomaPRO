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
public class Practica16 {
    
    /*Práctica 16: Cálculo del área de una Finca. La finca es rectangular así que el usuario
      introducirá el número de metros de cada lado y se le mostrará el área calculada tanto en
      metros cuadrados como en centímetros cuadrados
    */
    
    public static void main(String[] args) {
        
        Scanner cin = new Scanner(System.in);
        System.out.print("Introducir un lado: ");
        int lado1  = cin.nextInt();
        System.out.print("Introducir el segundo lado: ");
        int lado2  = cin.nextInt();
        
        int resultado = lado1*lado2;
        int cm = resultado*100;
                
        System.out.println("El area de la finca es " + resultado +" y en cm es "+ cm+"cm");
        
        
    }
    
}
