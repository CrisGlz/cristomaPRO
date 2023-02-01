/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier5;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Cristo Manuel Glez Delgado
 */
public class Practica19 {
    
  

   public static void main(String[] args) {
        ArrayList<String> frases = new ArrayList<>();
   Scanner scanner = new Scanner(System.in);
   Random random = new Random();
      System.out.println("Introduce las frases (escribe 'fin' para finalizar):");
      while (true) {
         String frase = scanner.nextLine();
         if (frase.equals("fin")) {
            break;
         }
         frases.add(frase);
      }

      int index = random.nextInt(frases.size());
      String fraseDelDia = frases.get(index);
      System.out.println("La frase del día es: " + fraseDelDia);
   }
}

