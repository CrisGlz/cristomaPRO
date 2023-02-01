/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier5;

/**
 *
 * @author Cristo Manuel Glez Delgado
 */
public class Practica14 {
    public static void main(String[] args) {
        String identificador = "Juan-23-daw";
if (identificador.matches("[A-Z][a-z]+-[2-9][0-9]-[a-z]{3}")) {
    System.out.println("El formato del identificador es correcto.");
} else {
    System.out.println("El formato del identificador es incorrecto.");
}
    }
    
    
}
