/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier4.MainFraccion;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class Main {

    public static void main(String[] args) {

        Fraccion fr1 = new Fraccion(2, 3);
        Fraccion fr2 = new Fraccion(4, 3);
        Fraccion fr5 = new Fraccion(3, 5);
        Fraccion.Sumar(fr1, fr2);

        Fraccion opuestoFr5 = fr5.opuesto();
        Fraccion inversoFr5 = fr5.inverso();
        System.out.println(inversoFr5);
        
    }

}
