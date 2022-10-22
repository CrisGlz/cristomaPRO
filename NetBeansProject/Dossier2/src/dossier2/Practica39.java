/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier2;

import java.util.Scanner;

/**
 *
 * @author Cris
 */
public class Practica39 {

public static void main(String[] args) {
        boolean finalizar = false;
        int numero, invertido = 0, resto, copianum;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ejemplo para la inversión de un número");

        while(finalizar == false){
            System.out.println("Ingrese un numero");
            numero = sc.nextInt();
            
            if(numero>=10 & numero <=99){
            while( numero>0){
            resto = numero % 10;
                invertido = (invertido * 10) + resto;
                numero /= 10;
            }
                System.out.println("El numero es: " + invertido);
                finalizar= true;
            }else{
                System.out.println("Ingrese un numero valido");
            }
        }

    }

}
