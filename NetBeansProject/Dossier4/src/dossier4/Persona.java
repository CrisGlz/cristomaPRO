/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier4;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
class Persona {
    
    public double peso;
    public int altura;

    public Persona(double peso, int altura, String nombre, String apellido, int edad) {
        this.peso = peso;
        this.altura = altura;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    
    
    
    public Persona(double p, int a){
        this(p, a, "anónimo", "anónimo", 1);
        System.out.println("Hola a todos!");
    }

    private String nombre;
    private String apellido;
    private int edad;
    
    public static String direccion = "c/Las Cabezas s/n";
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int e){
        edad  =e;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public void setApellido(String a){
        apellido = a;
    }
    
    public String toString(){
        return nombre + " " + apellido + " " + edad +"años";
    }
    
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String n){
        nombre = n;
    }
    
    public String getNombreCompleto(){
        return nombre + " " +apellido;
    }

}
  