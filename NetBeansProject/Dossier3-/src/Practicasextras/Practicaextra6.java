/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicasextras;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class Practicaextra6 {

/**
 * Convierte un numero de una base a otra
 *
 * @param numero Numero a convertir
 * @param basex Base del numero a convertir
 * @param basey Base a la que queremos convertir
 * @return numero en formato decimal
 */
public static int basexABaseY(long numero, int basex, int basey) {
    if (basex >= 2 && basex <= 10 && basey >= 2 && basey <= 10) {
        if (basex == 10 || basey == 10) {
            int decimal = 0;
            int digito;
            final long DIVISOR = basey;
            for (long i = numero, j = 0; i > 0; i /= DIVISOR, j++) {
                digito = (int) (i % DIVISOR);
                decimal += digito * Math.pow(basex, j);
            }
            return decimal;
        } else {
            // Lo paso a decimal
            int aDecimal = basexABaseY(numero, basex, 10);
            // Lo paso a la base deseada
            int numeroBaseY = basexABaseY(aDecimal, 10, basey);
            return numeroBaseY;
        }
    } else {
        return -1;
    }
}
    
}
