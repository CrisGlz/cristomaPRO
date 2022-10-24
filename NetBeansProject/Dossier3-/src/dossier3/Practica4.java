/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier3;

import java.util.Scanner;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class Practica4 {

    static boolean numeroValido(int num1) {
        return num1 >= 20 && num1 <= 50 && num1 % 3 == 0;
    }

    public static void main(String[] args) {
        int num;
        Scanner cin = new Scanner(System.in);
        do {
            System.out.println(
                    "Introducir un número: ");
            num = cin.nextInt();
        } while (!numeroValido(num));
        System.out.println(
                "El número cumple los requisitos.Se puede continuar");
    }
}
