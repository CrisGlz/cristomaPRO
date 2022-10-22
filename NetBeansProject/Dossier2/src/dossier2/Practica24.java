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
public class Practica24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame una letra para saber tu idioma");
        System.out.println("c(castellano), i(ingles), f(frances)");
        String texto = sc.nextLine();

        switch (texto) {
            case "c":
                System.out.println("Buenos dias");
                break;
            case "i":
                System.out.println("Good morning");
                break;
            case "f":
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("No entiendo tu idioma");
        }
    }

}
