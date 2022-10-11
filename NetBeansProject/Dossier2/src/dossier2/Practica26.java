/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier2;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class Practica26 {
    
        public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("¿Quieres saber que tienes a primera hora?");
        System.out.println("Acuerdate 1:Lunes, 2:Martes, 3:Miercoles, 4:Jueves, 5:Viernes.");
        int numero = sc.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Lunes: FOL.");
                break;
            case 2:
                System.out.println("Martes: PRO.");
                break;
            case 3:
                System.out.println("Miercoles: BAE.");
                break;
            case 4:
                System.out.println("Jueves: ING.");
                break;
            case 5:
                System.out.println("Viernes: PRO.");
                break;
            default:
                System.out.println("¡Acuerdate solo numeros del 1 al 5.");
        }
    }

}
    
    
