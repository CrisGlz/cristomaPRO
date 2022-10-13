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
public class PracticaAdicional2 {
    public static void main(String[] args) {
       
        char letra;
        int size = 5;
        System.out.println("Te voy a generar una contraseña:");
        String password = " ";
        for(int i =0; i <size; i++){
        letra = (char) (49 + Math.random()*(int)('z' - 1));
        password += letra;
        }
            System.out.println("Tu Contraseña es: " + password);
}
}