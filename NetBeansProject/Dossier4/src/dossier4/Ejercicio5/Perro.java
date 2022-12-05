/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier4.Ejercicio5;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class Perro {
    
    private String raza;
    private String nombre;
    private int edad;
    private boolean isAlive;
    
    
    public void setRaza(String r){
        raza = r;
    }
    
    public String getRaza(){
        return raza;
    }
    
    /**
     * 
     * @param n el nombre del perrillo
     * @param r la raza
     * @param e  la edad
     */
    public Perro(String r, String n, int e){
        nombre = n;
        raza = r;
        edad = e;
        
    }
    
    public Perro(String n, String r){
        
        nombre = n;
        raza = r;
        edad = -1;
    }
    
    public Perro(String n){
        
        nombre = n;
        //raza = "";
        edad = -1;
    }
    
    public String toString(){
        return "nombre: " + nombre + " raza: " + raza + " edad: " + edad;
    }

  
    
}
