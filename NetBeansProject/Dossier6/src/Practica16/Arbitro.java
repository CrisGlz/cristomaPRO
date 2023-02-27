/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica16;

/**
 *
 * @author dam
 */
public class Arbitro extends ProfesionalBalocesto{
    
    int faltasPitadas;

    public Arbitro(int faltasPitadas, String nombre, String apellidos, int edad, int ingresosAnuales, int numeroFederado) {
        super(nombre, apellidos, edad, ingresosAnuales, numeroFederado);
        this.faltasPitadas = faltasPitadas;
    }
    
}
