/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ets;

import java.util.Scanner;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class CajanegraDNI {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su DNI");
        String dni = sc.nextLine();
        System.out.println("¿Tiene usted nacionalidad española");
        System.out.println("1. Sí | 2. No");
        int nac = sc.nextInt();
        System.out.println("Ingrese su edad");
        int edad = sc.nextInt();

        switch (nac) {
            case 1:
                for (int i = 0; i < 8; i++) {
                    if (!Character.isDigit(dni.charAt(i))) {
                        System.out.println("Ha introducido la letra de su DNI en un lugar erroneo.");
                        break;
                    }
                }
                if (dni.length() != 9) {
                    System.out.println("No cumple con la Longitud correcta.");
                    break;
                }

                if (edad < 18 | edad > 65) {
                    System.out.println("Su edad no es correcta");
                    break;
                }
                if (!Character.isLetter(dni.charAt(8))) {
                    System.out.println("No ha introducido una letra valida.");
                    break;
                } else {
                    System.out.println("Todo ha sido correcto");
                    System.out.println("Su edad es " + edad + " y su DNI es " + dni);
                }
                break;

            case 2:
                System.out.println("Debe ser ESPAÑOL para continuar");
        }

    }

}
