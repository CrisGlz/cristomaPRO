/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier4;

import java.util.Scanner;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class Practicaadicional1 {
    /*Crear una clase llamad
    CiudadanoCanario
        -Nombre
        -Apellido
        -Edad
        -Isla
    Crea un ciudadano de Tenerife y otro de GC.
    Se le pide al usuario introducir datos*
    */
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        Persona p = new Persona(2.3,60,"Ryuman","Martin");
        
        System.out.println(p.peso);
        System.out.println(p.altura);
        System.out.println(p.nombre);
    }
          
    
    
}
