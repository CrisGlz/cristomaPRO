/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier6.Ejemplos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dam
 */
public class Persona {

    private String nombre;
    private List<Viaje> lista = new ArrayList<Viaje>();

    public String getNombre() {
        return nombre;
    }

    public void addViaje(Viaje v) {
        lista.add(v);
    }

    public List<Viaje> getLista() {
        return lista;
    }

    public Persona(String nombre) {
        super();
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
