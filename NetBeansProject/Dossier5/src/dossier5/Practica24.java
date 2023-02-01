/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier5;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Cristo Manuel Glez Delgado
 */
public class Practica24 {
     public static void main(String[] args) {
      // Creación del HashMap
      Map<String, String> hashMap = new HashMap<>();
      hashMap.put("Hola", "Hello");
      hashMap.put("Adiós", "Goodbye");
      hashMap.put("Perro", "Dog");
      hashMap.put("Gato", "Cat");
      hashMap.put("Casa", "House");
      hashMap.put("Árbol", "Tree");
      hashMap.put("Comida", "Food");
      hashMap.put("Agua", "Water");
      hashMap.put("Sol", "Sun");
      hashMap.put("Luna", "Moon");
      
      System.out.println("HashMap:");
      for (Map.Entry<String, String> entrada : hashMap.entrySet()) {
         System.out.println(entrada.getKey() + ": " + entrada.getValue());
      }

      // Creación del TreeMap
      Map<String, String> treeMap = new TreeMap<>(hashMap);
      
      System.out.println("\nTreeMap:");
      for (Map.Entry<String, String> entrada : treeMap.entrySet()) {
         System.out.println(entrada.getKey() + ": " + entrada.getValue());
      }
   }
}

