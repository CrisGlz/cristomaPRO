/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier4.Ejercicio8;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class Escenario {
    
    String pantalla;
    Coche coches[];
    int contadorCoches = 0;
    
    public void addCoche(Coche coche){
        coches[contadorCoches] = coche;
    }
    
    public void reposicionarCoche(Coche coche){
       if (coche.getPoscicion() > pantalla.length() ){
           coche.setPoscicion(pantalla.length()-1);
       }
        if ( coche.getPoscicion() < 0){
            coche.setPoscicion(0);
        }
        
    }
    
   
    
    public boolean hayChoque(Coche coche){
        boolean hayChoque = false;
        
        for (int i = 0; i < coches.length; i++) {
            Coche coche1 = coches[i];
            
        }
  
        return hayChoque;
    }
    
    public Escenario(int longitud){
        pantalla = "";
        for (int i = 0; i < longitud; i++) {
            pantalla += "-";
            
        }
    }
    
    @Override
    public String  toString(){
        return pantalla;
    }
    
}
