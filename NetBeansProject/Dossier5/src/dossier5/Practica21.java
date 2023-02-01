/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier5;

import java.util.ArrayDeque;
import java.util.Scanner;

/**
 *
 * @author Cristo Manuel Glez Delgado
 */
 class Cliente {
   private String nombre;
   private String apellido;
   private int edad;

   public Cliente(String nombre, String apellido, int edad) {
      this.nombre = nombre;
      this.apellido = apellido;
      this.edad = edad;
   }

   public boolean menorDeEdad() {
      return edad < 18;
   }

   public String getNombre() {
      return nombre;
   }

   public String getApellido() {
      return apellido;
   }

   public int getEdad() {
      return edad;
   }
}



public class Practica21 {
      

   public static void main(String[] args) {
        ArrayDeque<Cliente> cola = new ArrayDeque<>();
     Scanner scanner = new Scanner(System.in);
      while (true) {
         System.out.println("Menú:");
         System.out.println("1. Agregar nuevo cliente a la cola");
         System.out.println("2. Atender cliente");
         System.out.println("3. Ver estado de la cola");
         System.out.println("4. Salir");

         int opcion = scanner.nextInt();
         scanner.nextLine();

         if (opcion == 1) {
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();

            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine();

            Cliente cliente = new Cliente(nombre, apellido, edad);
            if (cliente.menorDeEdad()) {
               System.out.println("No se puede agregar a menores de edad a la cola.");
               System.out.println("Datos del cliente que se iba a insertar en cola:");
               System.out.println("Nombre: " + nombre);
               System.out.println("Apellido: " + apellido);
               System.out.println("Edad: " + edad);
            } else {
               cola.add(cliente);
            }
         } else if (opcion == 2) {
            if (cola.isEmpty()) {
               System.out.println("No hay clientes en cola.");
            } else {
               Cliente cliente = cola.poll();
               System.out.println("Se ha atendido al cliente:");
               System.out.println("Nombre: " + cliente.getNombre());
               System.out.println("Apellido: " + cliente.getApellido());
               System.out.println("Edad: " + cliente.getEdad());
            }
         } else if (opcion == 3) {
            System.out.println("Tamaño de la cola: " + cola.size());
         } else if (opcion == 4) {
            break;
         }
      }
   }

}

