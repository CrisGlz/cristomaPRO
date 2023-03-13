/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica34;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author carlos
 */
public class EjerciciosLambdasStream {

    /**
     * @param args the command line arguments
     */
    static double contador = 0;

    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<Persona>();
        personas.add(new Hombre("Manuel", "Fernández", 23, 210, 75));
        personas.add(new Mujer("Marta", "Díaz", 25, 205, 55));
        personas.add(new Hombre("Luis", "Fernández", 20, 210, 70));
        personas.add(new Mujer("Ana", "Díaz", 27, 170, 65));
        personas.add(new Hombre("Armando", "San Miguel", 29, 175, 77));

        //Crear un arraylist con textos que indiquen por cada persona: "sexo: x años"   
        //este array quedará ordenado por peso
        ArrayList<String> listaEdadPersona = new ArrayList<String>();
        personas.stream()
                .sorted((a, b) -> Double.compare(a.pesoEnKg, b.pesoEnKg))
                .map(p -> {
                    String respuesta = "";
                    if (p instanceof Hombre) {
                        respuesta += "Hombre: ";
                    } else {
                        respuesta += "mujer: ";
                    }
                    respuesta += p.edad + " años";
                    return respuesta;
                })
                .collect(Collectors.toList());

        //Mostrar una persona de 27 años si hay alguna
        personas.stream()
                .filter(p -> p.edad == 27)
                .findFirst()
                .ifPresent(p -> System.out.println(p));

        //Mostrar la persona de más edad
        personas.stream()
                .sorted((b, a) -> Integer.compare(a.edad, b.edad))
                .findFirst()
                .ifPresent(p -> System.out.println(p));

        //edad maxima
        personas.stream()
                .mapToInt(p -> p.edad)
                .max()
                .ifPresent(p -> System.out.println(p));

        //calcular el peso medio de las mujeres
        double average = personas.stream()
                .filter(p -> p instanceof Mujer)
                .mapToDouble(p -> p.pesoEnKg)
                .average()
                .getAsDouble();

        //MOSTRAR el peso medio de las mujeres
        personas.stream()
                .filter(p -> p instanceof Mujer)
                .mapToDouble(p -> p.pesoEnKg)
                .average()
                .ifPresent(System.out::println);

        //Crear un Array con las distintas letras ordenadas que conforman los nombres de pila de las personas
        //(poner todas las letras en minúsculas si no lo están )
        // para este ejercicio es útil el método String.split("") que convierte una string en un array de String
        // Así como el método: Arrays.stream()  que convierte un array en un stream
        Map<String, List<Persona>> collect = personas.stream()
                .collect(Collectors.groupingBy(p -> p.nombre));
        for (String nombre : collect.keySet()) {
            System.out.println("Nombre: " + nombre + " lista: " + collect.get(nombre));

            //mostrar por cada persona como sería la media de peso si no se contara a esa persona para calcular 
            //la media. Esto es, como influye la persona en la media total
            // obtener la lista de personas
            //   personas.stream()
            //         .filter(p -> p != persona)
            //         .mapToDouble(q -> q.pesoEnKg)
            //         .average()
            //         .ifPresent(System.out::println);
            //obtener la diferencia de peso menor entre dos personas cualesquiera del array. Esto es por ejemplo, si hay dos personas
            //del array con el mismo peso, entonces devolvería cero
            personas.stream()
                    .map(p -> {
                        return personas.stream()
                                .filter(q -> q != p)
                                .map(q -> Math.abs(p.pesoEnKg - q.pesoEnKg))
                                .min((a, b) -> Double.compare(a, b))
                                .orElse(0.0);
                    })
                    .forEach(System.out::println);

            //Obtener un arraylist con las personas cuyo apellido también lo tiene otras personas del array    
            personas.stream()
                    .filter(p -> personas.stream()
                    .filter(q -> !p.equals(q))
                    .anyMatch(q -> q.apellido1.equals(p.apellido1)
                    .collect(Collectors.toCollection(ArrayList::new));
            .forEach(System.out::println);

        }
        //calcular el peso medio de las mujeres
        //
        //        
        //        //obtener la segunda altura máxima ( el número )
        //aquí nos quedamos con la tercera altura para ver como se usa skip en lugar de dos limit
        //mostrar las tres personas de más edad
        //mostrar las personas que tiene menos peso que el que le corresponde idealmente
        //1
        //obtener la persona con mayor peso del que le corresponde
        //2
        //Crear un arraylist con las mujeres al principio del array y luego los hombres
        //5
        //mostrar las personas que tienen más edad que la media
        //6    
        //mostrar las mujeres que son más altas que los hombres
        //15
        //mostrar los nombres completos  ordenados de más letras a menos letras
        //y obtener el número de letras totales de esos nombres
        //20
        //Crear un Array con las distintas letras ordenadas que conforman los nombres de pila de las personas
        //(poner todas las letras en minúsculas si no lo están )
        // para este ejercicio es útil el método String.split("") que convierte una string en un array de String
        // Así como el método: Arrays.stream()  que convierte un array en un stream
        //25

        //Obtener el imc mínimo ( el número ) y mostrar por cada
        //persona su imc
        //30
        //crear un arraylist con las mujeres, y obtener la edad media de los hombres
        //35
        //mostrar por cada persona cuántas personas tienen su misma edad
        //40
        //mostrar por cada mujer los hombres de su edad
        //45
        //mostrar ordenado para cada edad distinta presente, cuantas personas tienen esa edad
        //50
        //mostrar por cada persona como sería la media de peso si no se contara a esa persona para calcular 
        //la media. Esto es, como influye la persona en la media total
        //55
        //obtener la diferencia de peso menor entre dos personas cualesquiera del array. Esto es por ejemplo, si hay dos personas
        //del array con el mismo peso, entonces devolvería cero
        //60 
        // obtener la lista de personas


        //Obtener un arraylist con las personas cuyo apellido también lo tiene otras personas del array
        //65
        //Por cada persona generar tres pesos aleatorios que estén entre +-5 respecto al peso de la persona
        //mostrar todos los pesos generados y calcular la media de esos pesos. Si los números aleatorios
        //están bien generados esa media no debiera diferir mucho del peso medio de las personas del array
    }

}
