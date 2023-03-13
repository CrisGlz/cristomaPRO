/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica32_2;

import java.util.ArrayList;

/**
 *
 * @author dam
 */
public class Main {

    public static ArrayList<Persona> generador(int size) {
        ArrayList<Persona> resultado = new ArrayList();

        String nombresHombre[] = {"Alvaro", "Marcos", "Alfonso", "Luis"};
        String nombresMujeres[] = {"Ana", "Luisa", "Eva", "Luz", "Marta"};
        String apellidos[] = {"García", "Gonzáles", "Pérez", "Rodríguez", "Hernández"};

        for (int i = 0; i < size; i++) {
            int aleatorioApellido = (int) (Math.random() * apellidos.length);
            String apellido1 = apellidos[aleatorioApellido];
            String apellido2 = apellidos[(int) (Math.random() * apellidos.length)];
            int edad = (int) ((Math.random() * 82) + 18);
            int altura = (int) ((Math.random() * 50) + 150);
            int peso = (int) (Math.random() * 40 + 60);

            if (Math.random() >= 0.5) {
                String nombre = nombresHombre[(int) (Math.random() * nombresHombre.length)];

                resultado.add(new Hombre(nombre, apellido1, apellido2, edad, altura, peso));

            } else {
                String nombre = nombresMujeres[(int) (Math.random() * nombresHombre.length)];

                resultado.add(new Mujer(nombre, apellido1, apellido2, edad, altura, peso));
            }
        }
        return resultado;

    }

    public static void main(String[] args) {

        ArrayList<Persona> personas = generador(3);
        personas.stream()
                .filter(p->p.edad >=67) // me quedo con los jubilados
                .map(p-> p.nombre+" "+p.apellido1+" edad: "+ p.edad)
                .forEach(texto-> System.out.println(texto));
        System.out.println(personas);
    }
}
