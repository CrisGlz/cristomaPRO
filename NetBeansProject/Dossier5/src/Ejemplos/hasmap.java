/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejemplos;
import java.until.Iterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
/**
 *
 * @author dam
 */
public class hasmap {
    public static void main(String[] args) {
        
        HashMap<String, ArrayList<String> >indicePorAutor = new HashMap< > ();
        
        // JKRowling: La piedra filosofal, El cáliz de fuego
        
        // Brandon Sanderson: Camino de los Reyes, El Imperio Final 
        
        // Tolkien: El señor de los anillos, EL Hobbit
        
        // Marie Lu: Legend, Prodigy
        
        ArrayList<String> listarowling = new ArrayList<String>();
        listarowling.add("La piedra filosofal");
        listarowling.add("El caliz de fuego");
        
        indicePorAutor.put("Rowling", listarowling);
    }
    
    
    
}
