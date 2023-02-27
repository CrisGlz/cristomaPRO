/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ets;

import java.util.Scanner;

/**
 *
 * @author dam
 */
import java.util.Scanner;

public class DNIexamen {

    public static Scanner entrada = new Scanner(System.in);
    public static String entradaUsuario = "";
    public static String letra[] = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

    public static void main(String arg[]) {
        System.out.print("Entre un número de DNI máximo 9 digitos: ");
        entradaUsuario = entrada.nextLine();
        System.out.print(obtenerLetra());
    }

    // Obtener letra DNI
    public static String obtenerLetra() {
        int numDNI = Integer.parseInt(entradaUsuario);
        int posicionLetra = numDNI % 23;
        String NIF = "El DNI con número " + entradaUsuario + " tiene la letra " + letra[posicionLetra] + "\n";
        NIF = NIF + "El DNI o NIF es: " + entradaUsuario + "-" + letra[posicionLetra];
        return NIF;
    }

    static String obtenerLetra(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static String obtenerLetra(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
