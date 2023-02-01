/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cristo Manuel Glez Delgado
 */
public class Practica20 {
 


   

   public static void main(String[] args) {
         ArrayList<String> frases = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
      System.out.println("Introduce las frases (escribe 'fin' para finalizar):");
      while (true) {
         String frase = scanner.nextLine();
         if (frase.equals("fin")) {
            break;
         }
         frases.add(frase);
      }

      System.out.println("Las frases que empiezan con la letra A mayúscula son:");
      for (String frase : frases) {
         if (frase.startsWith("A")) {
            System.out.println(frase);
         }
      }
   }
}

