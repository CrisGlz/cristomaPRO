/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica20;

import java.util.ArrayList;

/**
 *
 * @author dam
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<IOrdenable> lista = new ArrayList<>(2);
        lista.add(new Mujer("nombre", "apellido1", "apellido2", 32, 160, 60));
        lista.add(new Hombre("nombre", "apellido1", "apellido2", 32, 160, 60));

        Fraccion f1 = new Fraccion(4, 3);
        lista.add(f1);

        Fraccion f2 = new Fraccion(3, 2);
        lista.add(f2);

        Fraccion fraccionBase = new Fraccion(4,5);
        Persona personaBase = new Mujer("nombr", "apellido1", "apellido2", 32, 160, 60);
        
        
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i) instanceof Persona){
                if( personaBase.esMayorQue((Persona)lista.get(i))){
                    System.out.println("Es mayor que: " + lista.get(i));  
                }else if (personaBase.esIgualQue((Persona)lista.get(i))){
                    System.out.println("Es igual que: "+ lista.get(i));
                }else{
                    System.out.println("Es menor que: " + lista.get(i));
               }            
            }       
             else if(lista.get(i) instanceof Fraccion){
                 if( fraccionBase.esMayorQue((Fraccion)lista.get(i))){
                    System.out.println("Es mayor que: " + lista.get(i));  
                }else if (fraccionBase.esIgualQue((Fraccion)lista.get(i))){
                    System.out.println("Es igual que: "+ lista.get(i));
                }else{
                    System.out.println("Es menor que: " + lista.get(i));
               }    
        }
        }
        
    }
}


