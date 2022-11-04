/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Cris
 */
public class Practica21 {
    
    public static void main(String[] args) {
    int num1=0;
    int num2=0;
    int arrayEnteros[] = new int[2];
    Scanner sc= new Scanner(System.in);
    boolean entero = true;
        do {
            try {
                System.out.println("El primer numero tiene que ser entero y estar entre 1 y 100");
                System.out.println("Ingrese un numero");
                num1=sc.nextInt();
                System.out.println("Ingrese un numero");
                num2=sc.nextInt();

                if (num1<1 || num1>100){
                throw new  ArithmeticException();
                }
                entero=true;
            } catch (ArithmeticException ex) {
                System.out.println("No es un numero entre 1 y 100");
                entero=false;
            } catch(InputMismatchException ex){
                System.out.println("Tiene que ingresar un numero entero");
                sc.nextLine();
                entero=false;
            }

        } while (!entero);
        System.out.println(num1);
    }
}
    

