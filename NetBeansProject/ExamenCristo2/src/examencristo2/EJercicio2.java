/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examencristo2;

import java.util.Scanner;

/**
 *
 * 15:56 @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class EJercicio2 {

    static public void cercania(String palabra, String letra) {

        palabra.toLowerCase();

        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.matches(letra)) {
                String letraclave = letra;
                System.out.println(letraclave.substring(i)+letraclave.substring(i-1)+letraclave.substring(i+1));
            }
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una palabra");
        String palabra = sc.nextLine();
        System.out.println("Introduce la letra");
        String letra = sc.nextLine();

    }

}
