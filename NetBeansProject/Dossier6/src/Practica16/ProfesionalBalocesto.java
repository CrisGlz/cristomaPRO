/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica16;

/**
 *
 * @author dam
 */
public class ProfesionalBalocesto {

    String nombre;
    String apellidos;
    int edad;
    int ingresosAnuales;
    int numeroFederado;

    public ProfesionalBalocesto(String nombre, String apellidos, int edad, int ingresosAnuales, int numeroFederado) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.ingresosAnuales = ingresosAnuales;
        this.numeroFederado = numeroFederado;
    }

    @Override
    public String toString() {
        return "ProfesionalBalocesto{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", ingresosAnuales=" + ingresosAnuales + ", numeroFederado=" + numeroFederado + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getIngresosAnuales() {
        return ingresosAnuales;
    }

    public void setIngresosAnuales(int ingresosAnuales) {
        this.ingresosAnuales = ingresosAnuales;
    }

    public int getNumeroFederado() {
        return numeroFederado;
    }

    public void setNumeroFederado(int numeroFederado) {
        this.numeroFederado = numeroFederado;
    }

}
