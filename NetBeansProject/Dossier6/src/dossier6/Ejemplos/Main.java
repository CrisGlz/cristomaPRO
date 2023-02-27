/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier6.Ejemplos;

import java.util.ArrayList;

/**
 *
 * @author dam
 */
class Arbol {

    enum ColoresHoja {
        VERDE, GRIS, AMARILLO, PARDO
    }
    ArrayList<Hoja> mishojas;
    String especie;
    int altura;

    public Arbol(String especie, int altura) {
        mishojas = new ArrayList<Hoja>();
        this.especie = especie;
        this.altura = altura;
    }

    public class Hoja {

        int size;
        ColoresHoja color;

        public Hoja(int size) {
            this.size = size;
            if (Arbol.this.especie.equals("pino")) {
                color = ColoresHoja.VERDE;
            } else {
                color = ColoresHoja.values()[(int) (Math.random() * 4)];
            }
        }
    }
}
