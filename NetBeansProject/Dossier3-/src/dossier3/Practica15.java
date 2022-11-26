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
public class Practica15 {
    
       public static int aleatorio(int limS, int limI) {
        Random rnd = new Random();
        int aleat = limI + rnd.nextInt(limS - limI + 1);
        return aleat;
    }

    public static void main(String[] args) {
        int[] arrayNumero = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int limInNum = 1;
        int limSupNum = 10;
        int[] arrayPalo = {1, 2, 3, 4};
        int limSupPalo = 4;
        int numero = aleatorio(limSupNum, limInNum);
        int palo = aleatorio(limSupPalo, limInNum);
        switch (numero) {
            case 1:
                System.out.print("1 de");
                break;
            case 2:
                System.out.print("2 de");
                break;
            case 3:
                System.out.print("3 de");
                break;
            case 4:
                System.out.print("4 de");
                break;
            case 5:
                System.out.print("5 de");
                break;
            case 6:
                System.out.print("6 de");
                break;
            case 7:
                System.out.print("7 de");
                break;
            case 8:
                System.out.print("Sota de");
                break;
            case 9:
                System.out.print("Caballo de");
                break;
            case 10:
                System.out.print("Rey de");
                break;
        }
        switch (palo) {
            case 1:
                System.out.println(" oros");
                break;
            case 2:
                System.out.println(" copas");
                break;
            case 3:
                System.out.println(" espadas");
                break;
            case 4:
                System.out.println(" espadas");
                break;
        }
    }
}

    

