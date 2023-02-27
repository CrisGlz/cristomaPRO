/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica10;

/**
 *
 * @author dam
 */
public class PruebaAbstracto {

    public static void main(String[] args) {
        Pajaro p = new Pajaro();
        Perro perro = new Perro();
        perro.dientes=50;
        perro.nombre="Firulais";
        perro.edad=6;
        perro.peso=15;
    }
}

abstract class Animal {

    protected String nombre;
    protected int edad;
    protected int peso;

    public Animal() {
        System.out.println("jajaja! soy un animal!!!!");
    }
//private abstract String emitirSonido();
}

class Perro extends Animal {

    int dientes;

    @Override
    public String toString() {
        return "Perro{" + "dientes=" + dientes + '}'+" "+"nombre: "+nombre+" "+"edad: "+edad;
    }
}

class Pajaro extends Animal {

    double ala;
}
