/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examencristoprimeraevaluacion;

/**
 *
 * @author 15:22 Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class Ejercicio3 {

    static String modificarTiempo(int hora, int minutos, int segundos, int agregarSegundos) {


               
        for (int i = 0; i < agregarSegundos; i++) {
            segundos++;

            if (segundos == 60) {
                segundos = 00;
                minutos++;
            }
            if (minutos == 60) {
                minutos = 00;
                hora++;
            }
            if (hora == 24) {
                hora = 00;
            }

        }
        System.out.println(hora + ":" + minutos + ":" + segundos);
        return null;
    }

    public static void main(String[] args) {
        int hora = 23;
        int minutos = 59;
        int segundos = 59;
        int agregarSegundos = 1;

        modificarTiempo(hora, minutos, segundos, agregarSegundos);
    }
}
