/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica16;

/**
 *
 * @author dam
 */
public class Entrenador extends ProfesionalBalocesto{
    
    double protentajeVictorias;

    public Entrenador(double protentajeVictorias, String nombre, String apellidos, int edad, int ingresosAnuales, int numeroFederado) {
        super(nombre, apellidos, edad, ingresosAnuales, numeroFederado);
        this.protentajeVictorias = protentajeVictorias;
    }
}
