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
public class Practica25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Te dire si tu letra es una Vocal");
        System.out.println("Acuerdate a,e,i,o,u");
        String texto = sc.nextLine();

        switch (texto) {
            case "a":
            case "A":
            case "e":
            case "E":
            case "i":
            case "I":
            case "o":
            case "O":
            case "u":
            case "U":
                System.out.println("¡Es una vocal!");
                break;
            default:
                System.out.println("No es una vocal");
        }
    }

}
