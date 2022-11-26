/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier3;

import java.util.Random;

/**
 *
 * @author Cris
 */
public class Practica16 {
    
       
    public static int numsAleatorios(int limI, int limS) {
        Random rnd = new Random();
        int numAleatorio = limI + rnd.nextInt(limS - limI + 1);
        return numAleatorio;
    }
    
    public static void main(String[] args) {
        int array[] = new int[10];
        int limI = 1;
        int limS = 100;
        int numeroAleatorio;
        int sumaAleatorios = 0;
        int mediaSuma = 0;
        for (int i = 0; i < 10; i++) {
            numeroAleatorio = numsAleatorios(limI, limS);
            array[i] = numeroAleatorio;
            System.out.print(numeroAleatorio + " ");
            sumaAleatorios += numeroAleatorio;
        }
        mediaSuma = sumaAleatorios / 10;
        System.out.println("");
        System.out.println("La media de esos diez números es: " + mediaSuma);
        System.out.println("");
        System.out.print("Estos son los números que son mayores que la media: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > mediaSuma) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println("");
    }
}

    
    

