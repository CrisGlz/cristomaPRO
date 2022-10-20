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
public class Practica36 {

    @SuppressWarnings({"empty-statement", "empty-statement"})
    public static void main(String[] args) {

        int tirada;
        int suma = 0;
        String caracter = null;

        System.out.print("Tirada de tres dados: ");
        Scanner sc = new Scanner(System.in);

        while (!"f".equals(caracter) && !"F".equals(caracter)) {

            for (int i = 0; i < 3; i++) {
                tirada = (int) (Math.random() * 6) + 1;
                System.out.print(tirada + " ");
                suma += tirada;
            }
            System.out.println("\n-----------------------------------------");
            System.out.println("\nPulsa f/F para parar o cualquier otra tecla para Continaur.");
            System.out.println("\n-----------------------------------------");
            caracter = sc.nextLine();
        }

        System.out.println("\nSuma: " + suma);
    }
}
