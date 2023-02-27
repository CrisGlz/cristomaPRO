/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author dam
 */
public class Ejemplo {

    class ComparadorMujeres implements Comparator<Mujer> {

        @Override
        public int compare(Mujer p1, Mujer p2) {
            return Integer.compare(p1.edad, p2.edad);
        }
    }

    public static void main(String[] args) {
        ArrayList<Mujer> mujeres = new ArrayList<>(3);
        mujeres.add(new Mujer("Marta", "León", "León", 25, 180, 60));
        mujeres.add(new Mujer("Julia", "Luz", "Luz", 20, 160, 55));
        mujeres.add(new Mujer("Pilar", "Ramos", "Ramos", 29, 165, 58));
        
        Comparator<Mujer> comparator = new Comparator<Mujer>(){
            @Override
            public int compare(Mujer t, Mujer t1) {
                return t.edad - t1.edad;
            }
            
        };
        
        
        
        
        Collections.sort(mujeres, new ComparadorMujeres());
        for (Mujer p : mujeres) {
            System.out.println(p);
        }
    }

}
