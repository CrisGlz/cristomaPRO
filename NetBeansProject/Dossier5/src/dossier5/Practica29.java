/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier5;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Cristo Manuel Glez Delgado
 */
public class Practica29 {
     
   
   public static void main(String[] args) {
       HashMap<String, Integer> partidos = new HashMap<>();
    Scanner scanner = new Scanner(System.in);
      while (true) {
         System.out.println("Menú:");
         System.out.println("1. Introducir partido y votos");
         System.out.println("2. Consultar votos de un partido");
         System.out.println("3. Mostrar partidos y votos dentro de un rango");
         System.out.println("4. Salir");

         int opcion = scanner.nextInt();
         scanner.nextLine();

         if (opcion == 1) {
            System.out.print("Nombre del partido: ");
            String nombre = scanner.nextLine();

            System.out.print("Votos: ");
            int votos = scanner.nextInt();
            scanner.nextLine();

            partidos.put(nombre, votos);
         } else if (opcion == 2) {
            System.out.print("Nombre del partido: ");
            String nombre = scanner.nextLine();

            if (partidos.containsKey(nombre)) {
               System.out.println("Votos: " + partidos.get(nombre));
            } else {
               System.out.println("No se ha encontrado el partido especificado.");
            }
         } else if (opcion == 3) {
            System.out.print("Límite inferior de votos: ");
            int limInferior = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Límite superior de votos: ");
            int limSuperior = scanner.nextInt();
            scanner.nextLine();

            for (String nombre : partidos.keySet()) {
               int votos = partidos.get(nombre);
               if (votos >= limInferior && votos <= limSuperior) {
                  System.out.println("Partido: " + nombre + ", Votos: " + votos);
               }
            }
         } else if (opcion == 4) {
            break;
         }
      }
   }

}

