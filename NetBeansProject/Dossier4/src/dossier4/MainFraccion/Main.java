/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier4.MainFraccion;

import java.util.Scanner;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Calculadora de Fracciones");
        boolean finalizar = false;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Menu");
            System.out.println("1)Suma");
            System.out.println("2)Resta");
            System.out.println("3)Multiplicacion");
            System.out.println("4)Division");
            System.out.println("5)Opuesto");
            System.out.println("6)Inverso");
            System.out.println("7)Comparacion");
            System.out.println("8)Salir");
            int opc = sc.nextInt();

            switch (opc) {

                case 1:
                    System.out.println("Ingrese el numerador de la primera fraccion");
                    int numeradorSum1 = sc.nextInt();
                    System.out.println("Ingrese el denominador de la primera fraccion");
                    int denominadorSum1 = sc.nextInt();
                    System.out.println("Ingrese el numerador de la segunda fraccion");
                    int numeradorSum2 = sc.nextInt();
                    System.out.println("Ingrese el denominador de la segunda fraccion");
                    int denominadorSum2 = sc.nextInt();
                    Fraccion fr1 = new Fraccion(numeradorSum1, denominadorSum1);
                    Fraccion fr2 = new Fraccion(numeradorSum2, denominadorSum2);
                    Fraccion fr3 = Fraccion.Sumar(fr1, fr2);
                    System.out.println("La suma de: " + fr1 + " + " + fr2 + " es: " + fr3);
                    System.out.println("---------");
                    break;
                case 2:
                    System.out.println("Ingrese el numerador de la primera fraccion");
                    int numeradorRest1 = sc.nextInt();
                    System.out.println("Ingrese el denominador de la primera fraccion");
                    int denominadorRest1 = sc.nextInt();
                    System.out.println("Ingrese el numerador de la segunda fraccion");
                    int numeradorRest2 = sc.nextInt();
                    System.out.println("Ingrese el denominador de la segunda fraccion");
                    int denominadorRest2 = sc.nextInt();
                    Fraccion fr4 = new Fraccion(numeradorRest1, denominadorRest1);
                    Fraccion fr5 = new Fraccion(numeradorRest2, denominadorRest2);
                    Fraccion fr6 = Fraccion.Restar(fr4, fr5);
                    System.out.println("La resta de: " + fr4 + " + " + fr5 + " es: " + fr6);
                    System.out.println("---------");

                    break;

                case 3:
                    System.out.println("Ingrese el numerador de la primera fraccion");
                    int numeradorMult1 = sc.nextInt();
                    System.out.println("Ingrese el denominador de la primera fraccion");
                    int denominadorMult1 = sc.nextInt();
                    System.out.println("Ingrese el numerador de la segunda fraccion");
                    int numeradorMult2 = sc.nextInt();
                    System.out.println("Ingrese el denominador de la segunda fraccion");
                    int denominadorMult2 = sc.nextInt();
                    Fraccion fr7 = new Fraccion(numeradorMult1, denominadorMult1);
                    Fraccion fr8 = new Fraccion(numeradorMult2, denominadorMult2);
                    Fraccion fr9 = Fraccion.Multiplicar(fr7, fr8);
                    System.out.println("La multiplicacion de: " + fr7 + " + " + fr8 + " es: " + fr9);
                    System.out.println("---------");
                    break;
                case 4:
                    System.out.println("Ingrese el numerador de la primera fraccion");
                    int numeradorDiv1 = sc.nextInt();
                    System.out.println("Ingrese el denominador de la primera fraccion");
                    int denominadorDiv1 = sc.nextInt();
                    System.out.println("Ingrese el numerador de la segunda fraccion");
                    int numeradorDiv2 = sc.nextInt();
                    System.out.println("Ingrese el denominador de la segunda fraccion");
                    int denominadorDiv2 = sc.nextInt();
                    Fraccion fr10 = new Fraccion(numeradorDiv1, denominadorDiv1);
                    Fraccion fr11 = new Fraccion(numeradorDiv2, denominadorDiv2);
                    Fraccion fr12 = Fraccion.Dividir(fr10, fr11);
                    System.out.println("La multiplicacion de: " + fr10 + " + " + fr11 + " es: " + fr12);
                    System.out.println("---------");

                    break;
                case 5:
                    System.out.println("Ingrese el numerador de la fraccion");
                    int numeradorOp = sc.nextInt();
                    System.out.println("Ingrese el denominador de la fraccion");
                    int denominadorOp = sc.nextInt();
                    Fraccion fr13 = new Fraccion(numeradorOp, denominadorOp);
                    Fraccion frOp = fr13.opuesto();
                    System.out.println("La fraccion opuesta de: " + fr13 + " es: " + frOp);
                    System.out.println("---------");
                    break;

                case 6:
                    System.out.println("Ingrese el numerador de la fraccion");
                    int numeradorIn = sc.nextInt();
                    System.out.println("Ingrese el denominador de la fraccion");
                    int denominadorIn = sc.nextInt();
                    Fraccion fr14 = new Fraccion(numeradorIn, denominadorIn);
                    Fraccion frIn = fr14.inverso();
                    System.out.println("La fraccion opuesta de: " + fr14 + " es: " + frIn);
                    System.out.println("---------");
                    break;
                case 7:
                    System.out.println("Ingrese el numerador de la fraccion");
                    int numerador1 = sc.nextInt();
                    System.out.println("Ingrese el denominador de la fraccion");
                    int denominador1 = sc.nextInt();
                    System.out.println("Ingrese el numerador de la fraccion");
                    int numerador2 = sc.nextInt();
                    System.out.println("Ingrese el denominador de la fraccion");
                    int denominador2 = sc.nextInt();
                    Fraccion fr15 = new Fraccion(numerador1, denominador1);
                    Fraccion fr16 = new Fraccion(numerador2, denominador2);

                    System.out.println("¿Como quieres comparar?");
                    System.out.println("1)Primera fraccion MAYOR que la segunda");
                    System.out.println("2)Primera fraccion MENOR que la segunda");
                    int opcion = sc.nextInt();
                    switch (opcion) {

                        case 1:
                            System.out.println(fr15.MayorQue(fr16));
                            break;
                        case 2:
                            System.out.println(fr15.menorQUe(fr16));
                            break;

                    }

                    System.out.println(fr15.MayorQue(fr16));
                    System.out.println("---------");

                    break;

                case 8:
                    finalizar = true;
                    break;

            }

        } while (!finalizar);
        System.out.println("---------");
        System.out.println("A salido de la calculadora");

                
}
}