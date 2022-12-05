/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier4.Ejercicio11;

import java.util.Scanner;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        
        int idCliente = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("--MENU--");
        System.out.println("Datos del cliente:");
        System.out.println("Nombre");
        String nombre = sc.nextLine();
        System.out.println("¿Cantida de noches?");
        int cantidadnoches = sc.nextInt();sc.nextLine();
        System.out.println("Precio Noche");
        double precionoche =  sc.nextDouble();sc.nextLine();
        
        new Cliente(nombre, nombre, habitacion,idCLiente,precionoche,cantidadnoches);
        
    }
    
    
}
