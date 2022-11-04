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
public class Practica20 {
    
    public static void main(String[] args) {
        
    System.out.println("Introducir un número: ");
    Scanner sc = new Scanner(System.in);
    int numero=0, division=0;
    boolean unNumero;


    do{

        try {
            numero = sc.nextInt();
                division = 5/numero;
                unNumero =true;

        }catch (InputMismatchException ex) {
            System.out.println("No has introducido un numero");
            sc.nextLine();
            unNumero = false;
        }catch(ArithmeticException ex){
            System.out.println(" no es un numero valido");
            sc.nextLine();
            unNumero=false;
        }
 
    }while(!unNumero);
     System.out.println("El número introducido es: " + numero + " y la división de 5/"+ numero+" da: "+ division);

    }
}
    
   
    
    

