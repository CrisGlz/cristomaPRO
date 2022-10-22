/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class Practica33 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int intentos = 3;
        boolean acierto = false;
        while (acierto != true && intentos != 0) {
            System.out.println("Ingrese el codigo");
            int codigousuario = sc.nextInt();
            if (codigousuario == 1234) {
                System.out.println("Has Acertado");
                acierto = true;
            } else {
                System.out.println("has falllado vuelve a intentarlo");
            }
            intentos--;

        }

    }
}
