/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica16;

/**
 *
 * @author dam
 */
public class Jugador extends ProfesionalBalocesto {

    Posicion posicion;

    enum Posicion {
        BASE, PIVOT, ALERO, ESCOLTA, ALAPIVOT
    }
    int partidosJugados;
    String equipo;

    public Jugador(Posicion posicion, int partidosJugados, String equipo, String nombre, String apellidos, int edad, int ingresosAnuales, int numeroFederado) {
        super(nombre, apellidos, edad, ingresosAnuales, numeroFederado);
        this.posicion = posicion;
        this.partidosJugados = partidosJugados;
        this.equipo = equipo;
    }


    


}
