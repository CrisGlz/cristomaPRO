/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica12;

/**
 *
 * @author dam
 */
public class Main {

    public static void main(String[] args) {
        Hombre a = new Hombre(" ", " ", "", 35, 176, 77.0);

        System.out.println("IMC: " + a.calcularIMC());
        System.out.println("PSI: HOMBRE "+ a.calcularPesoIdeal());
    }

}
