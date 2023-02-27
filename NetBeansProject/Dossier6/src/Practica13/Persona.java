/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica13;



/**
 *
 * @author dam
 */
public abstract class Persona {
    protected String nombre;
    protected String apellido1;
    protected String apellido2;
    protected int edad;
    protected int altura;
    protected double peso;
    
    public Persona(String nombre, String apellido1, String apellido2, int edad, int altura, double peso) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }
    
    protected double calcularIMC() {
        return peso / Math.pow(altura/100.0, 2);
    }
    
    public abstract double calcularPesoIdeal();
    
    @Override
    public String toString() {
        return nombre + " " + apellido1 + " " + apellido2 + ", " + edad + " años, " + altura + " cm, " + peso + " kg";
    }
}




