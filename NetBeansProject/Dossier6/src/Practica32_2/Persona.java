/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica32_2;

/**
 *
 * @author dam
 */
abstract class Persona {
    
    String nombre;
    String apellido1;
    String apellido2;
    int edad;   
    int altura;   // EN CM
    double peso;  // EN KG

    public Persona(String nombre, String apellido1, String apellido2, int edad, int altura, double peso) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso + '}';
    }
    
    protected double calcularIMC(){
        return peso/(altura/100 * altura/100);
    }
    
    abstract double calcularPesoIdeal();
}