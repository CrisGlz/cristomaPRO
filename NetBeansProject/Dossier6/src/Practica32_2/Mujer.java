/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica32_2;

/**
 *
 * @author dam
 */
class Mujer extends Persona{

    public Mujer(String nombre, String apellido1, String apellido2, int edad, int altura, double peso) {
        super(nombre, apellido1, apellido2, edad, altura, peso);
    }



    
    
    @Override
    double calcularPesoIdeal() {
        return altura - 100 - ((100 - 150)/ 2);
    }
    
}
