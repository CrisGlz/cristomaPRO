/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dossier3;

import java.util.Scanner;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class Dossier3 {

    public static int maximoComunDivisor(int a, int b) {
        int temporal;
        while (b != 0) {
            temporal = b;
            b = a % b;
            a = temporal;
        }
        return a;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Calculo de MCD para dos numeros:");
        System.out.println("Ingresa el primer numero");
        int a = sc.nextInt();
        System.out.println("Ingresa el segundo numero");
        int b = sc.nextInt();
        maximoComunDivisor(a, b);
        System.out.println("El MCD de " + a + " y " + b +" es "+ maximoComunDivisor(a, b));

    }

}

