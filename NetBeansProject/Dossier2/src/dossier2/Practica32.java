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
public class Practica32 {

    public static void main(String[] args) {

        int suma = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero:");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo numero:");
        int num2 = sc.nextInt();

        if (num1 < num2) {
            for (int i = num1; i <= num2; i++) {
                System.out.println(i);
                suma += i;
            }
        }
    }
}
