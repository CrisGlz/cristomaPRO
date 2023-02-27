/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplos;

import java.util.ArrayList;
import java.util.TreeMap;

/**
 *
 * @author dam
 */
public class Trabajador {
    
    public int edad;

    public Trabajador(int edad, String nombre, String DNI) {
        this.edad = edad;
        this.nombre = nombre;
        this.DNI = DNI;
    }
    public String nombre;
    public String DNI;    
}

class Main{
    public static void main(String[] args) {
        TreeMap<Integer,ArrayList<Trabajador>> busquedaPorEdad = new TreeMap();
        
        Trabajador trabajador1 = new Trabajador(23,"Paulina","8943434S");
        Trabajador trabajador2 = new Trabajador(32,"Pilar","8943434S");
        Trabajador trabajador3 = new Trabajador(35,"Pablo","8943434S");
        Trabajador trabajador4 = new Trabajador(23,"Ramón","8943434S");
        Trabajador trabajador5 = new Trabajador(32,"Rosa","8943434S");
        ArrayList<Trabajador> get = busquedaPorEdad.get(23);
        if( get == null){
            get = new ArrayList<Trabajador>();
            busquedaPorEdad.put(23, get);
        }
        get.add(trabajador1);
        get.add(trabajador4);
        
    }

   
}