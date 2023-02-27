/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos;

import static java.awt.SystemColor.menu;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import static jdk.nashorn.internal.objects.NativeArray.map;

/**
 *
 * @author dam
 */
class Persona {

    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public int edad;
    public String nombre;

    @Override
    public String toString() {
        return "Persona{" + "edad=" + edad + ", nombre=" + nombre + '}';
    }
}

public class Main {

    public static Persona generadorPersona() {

// 0 - 121
        String nombres[] = {"Javier", "Moises", "Alejandro", "Cristian",
            "Ruben", "Cristo", "Daniel", "Oliver", "Pepe", "Juan"};
        int edad = (int) (Math.random() * (122 - 0) + 0);
        int posNombreAleatorio = (int) (Math.random() * nombres.length);
        return new Persona(edad, nombres[posNombreAleatorio]);

    }

    public static void main(String[] args) {
        TreeMap<Integer, HashSet<Persona>> busquedaPorEdad = new TreeMap<Integer, HashSet<Persona>>();
        TreeMap<Integer, HashSet<Persona>> busquedaPorInicial = new TreeMap<Integer, HashSet<Persona>>();
        HashSet<Persona> almacenPersonas = new HashSet<Persona>();

        for (int i = 0; i < 10; i++) {
            Persona p = generadorPersona();

            HashSet<Persona> get = busquedaPorEdad.get(p.edad);
            if (get == null) {
                HashSet<Persona> set = new HashSet<Persona>();
                set.add(p);
                busquedaPorEdad.put(p.edad, set);
            } else {
                get.add(p);
            }

            HashSet<Persona> get = busquedaPorInicial.get(p.nombre);
            if (get == null) {
                HashSet<Persona> set = new HashSet<Persona>();
                set.add(p);
                busquedaPorInicial.put(p.nombre, set);
            } else {
                get.add(p);
            }
        }
    }

    Scanner sc = new Scanner(System.in);

    System.out.println (
            

    "¿Que quieres hacer?");
    System.out.println (
            

    "1. Obtener las personas mayores de determinada edad");
    System.out.println (
            

    "2. Obtener las personas de una edad en concreto");
    System.out.println (
            
    "3. Obtener la lista de personas por inicial");
        int menu = sc.nextInt();
    int edad = 0;
    switch (menu) {

        case 2:
            System.out.println("Escriba la edad que le interesa.");
            edad = sc.nextInt();

            if (busquedaPorEdad.get(edad) != null) {
                HashSet<Persona> buscaEdad = busquedaPorEdad.get(edad);
                for (Persona persona : buscaEdad) {
                    System.out.println(persona);
                }
            }

            break;
        case 1:
            System.out.println("Escriba la edad que le interesa.");
            edad = sc.nextInt();
            SortedMap<Integer, HashSet<Persona>> tailMap = busquedaPorEdad.tailMap(edad);
            Collection<HashSet<Persona>> personas = tailMap.values();
            for (HashSet<Persona> p : personas) {
                System.out.println(p);
            }

            break;

        case 3:
            System.out.println("Escriba la inicial a buscar");
            int inicial = sc.nextInt();
            if (busquedaPorInicial.get(inicial) != null) {
                HashSet<Persona> buscaInicial = busquedaPorInicial.get(inicial);
                for (Persona persona : buscaInicial) {
                    System.out.println(persona);
                }
            }
            break;

    }

}
}
