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
public class Practica28 {
    
     public static int noSeMeOcurreNombre(int valor) {
        int resultado = 0;
        if (valor <= 1) {
            resultado = valor;
        } else {
            resultado = noSeMeOcurreNombre(valor - 5) + '5';
        }
        return resultado;
    }
    
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            
        }
    }
}
