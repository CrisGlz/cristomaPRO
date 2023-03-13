/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier6.Ejemplos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dam
 */
public class Principal {

    public static void main(String[] args) {
        Persona p = new Persona("pedro");
        Viaje v = new Viaje("Francia");
        Viaje v2 = new Viaje("Inglaterra");
        p.addViaje(v);
        p.addViaje(v2);
        Persona p1 = new Persona("gema");
        Viaje v3 = new Viaje("Italia");
        Viaje v4 = new Viaje("Belgica");
        p1.addViaje(v3);
        p1.addViaje(v4);
        List<Persona> lista = new ArrayList<Persona>();
        lista.add(p);
        lista.add(p1);

        lista.stream()
                .map(p2 -> p2.getNombre())
                .forEach(System.out::println);

        lista.stream()
                .map(p2 -> p2.getLista())
                .peek(obj -> System.out.println(obj.getClass().getName()))
                .map(lista2-> lista.stream())
                .forEach(lista2 -> {
                    for (viaje -> {
                        System.out.println(viaje);
                    }
                });

    }
}
