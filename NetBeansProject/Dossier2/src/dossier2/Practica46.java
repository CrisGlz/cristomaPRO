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
public class Practica46 {

    public static void main(String[] args) {


        Scanner lecturaDatos = new Scanner(System.in);
        System.out.println("Ingresa un numero decimal");

        int numerodecimal =lecturaDatos.nextInt();
        int auxiliar = numerodecimal;
        String binario="";

        while (auxiliar >0){
            binario = auxiliar %2 + binario;
            auxiliar /=2;
        }
        System.out.println("El numero decimal "+numerodecimal+" en binario es: "+binario);
    }
}




