/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier4;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */

   class Operaciones{
        static int suma(int num1, int num2){
            return num1+num2;
        }
        
        static String suma(String texto1, String texto2){
            return texto1 + texto2;
        }
    }

public class mainpruebas {
 
    
    
    public static void main(String[] args) {
        
        System.out.println(
        Operaciones.suma(3, 4)
        );
        System.out.println(
        Operaciones.suma("Hola", "Amigo")
        );
    }
}
