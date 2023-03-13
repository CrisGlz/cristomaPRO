/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier6.Ejemplos;

/**
 *
 * @author dam
 */
public class FuncionalInterface {

    @FunctionalInterface
    interface Operaciones<T> {

        String operacion(T a, T b);
    }

    public static void mostrarResultado(int x, int y, Operaciones op) {
        System.out.println(op.operacion(x, y));
    }

    public static void main(String[] args) {
        Operaciones<Integer> suma = (a, b) -> "x + y=" + (a + b);
        Operaciones<Integer> resta = (a, b) -> "x - y=" + (a - b);
        Operaciones<Integer> multiplica = (a, b) -> "x * y=" + (a * b);
        mostrarResultado(2, 3, suma);
        mostrarResultado(5, 1, resta);
        mostrarResultado(4, 7, multiplica);
    }

}
