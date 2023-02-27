/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica21;

import java.util.ArrayList;

/**
 *
 * @author dam
 */
public class Main {

    public static void main(String[] args) {

        Mujer nuevaMujer = new Mujer("Isabel", "Dorta", "Jiménez", 45, 165, 60);
        ImprimirEnMayuscula<Mujer> iem = new ImprimirEnMayuscula<Mujer>() {
            @Override
            public void imprimirMayuscula(Mujer mujer) {
                String val = mujer.toString();
                System.out.println(val.toUpperCase());
            }
        };
        iem.imprimirMayuscula(nuevaMujer);
        ArrayList<ImprimirEnMayuscula> imprimibles = new ArrayList<>();
        imprimibles.add(iem);

    }

}
