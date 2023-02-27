/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos;

import java.util.Comparator;
import java.util.TreeSet;

/**
 *
 * @author dam
 */
/*class Rombo {

    public double lado;
    public double diagonalMayor;
    public double diagonalMenor;

    @Override
    public String toString() {
        return "Rombo{" + "lado=" + lado + ", diagonalMayor=" + diagonalMayor + ", diagonalMenor=" + diagonalMenor + '}';
    }

}

public class Main {

    public static void main(String[] args) {
        Rombo rombo1 = new Rombo();
        rombo1.diagonalMayor = 7.4;
        rombo1.diagonalMenor = 3.6;
        rombo1.lado = 4;

        Rombo rombo2 = new Rombo();
        rombo2.diagonalMayor = 11;
        rombo2.diagonalMenor = 11;
        rombo2.lado = 2;

        Rombo rombo3 = new Rombo();
        rombo3.diagonalMayor = 11;
        rombo3.diagonalMenor = 7;
        rombo3.lado = 9;

        Rombo rombo4 = new Rombo();
        rombo4.diagonalMayor = 14;
        rombo4.diagonalMenor = 7;
        rombo4.lado = 2;

        class RomboComparator implements Comparator<Rombo> {

            @Override
            public int compare(Rombo r1, Rombo r2) {
                return Double.compare(r1.lado, r2.lado);

            }
        }

        RomboComparator rc = new RomboComparator();

        TreeSet<Rombo> treeSet = new TreeSet<Rombo>(rc);

        treeSet.add(rombo3);
        treeSet.add(rombo2);
        treeSet.add(rombo4);
        treeSet.add(rombo1);
        for (Rombo rombo : treeSet){
            System.out.println(rombo);
        }
    }
 */
public class Persona {

    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public int edad;
    public String nombre;

    @Override
    public String toString() {
        return "Persona{" + "edad=" + edad + ", nombre=" + nombre + '}';
    }
}




