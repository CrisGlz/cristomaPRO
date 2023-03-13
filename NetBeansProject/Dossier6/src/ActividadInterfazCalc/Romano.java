/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActividadInterfazCalc;

import java.util.NavigableMap;
import java.util.TreeMap;

/**
 *
 * @author dam
 */
public class Romano {

    String numRomano;
    int equivalenteEntero;
    static TreeMap<Integer, String> equivalencias;

    @Override
    public String toString() {
        return "Romano{" + "numRomano=" + numRomano + ", equivalenteEntero=" + equivalenteEntero + '}';
    }

    int romanoToInt(String romano) {

        return 0;

    }

    private void construirEquivalencias() {
        equivalencias = new TreeMap();
        equivalencias.put(1000, "M");
        equivalencias.put(900, "CM");
        equivalencias.put(500, "D");
        equivalencias.put(400, "CD");
        equivalencias.put(100, "C");
        equivalencias.put(90, "XC");
        equivalencias.put(50, "L");
        equivalencias.put(40, "XL");
        equivalencias.put(10, "X");
        equivalencias.put(9, "IX");
        equivalencias.put(5, "V");
        equivalencias.put(4, "IV");
        equivalencias.put(1, "I");
    }

    String intToRomano(int numConvertir) {
        String resultado = "";

        NavigableMap<Integer, String> mapa = equivalencias.descendingMap();

        for (Integer numero : mapa.keySet()) {
            while (numero <= numConvertir) {
                resultado += mapa.get(numero);
                numConvertir -= numero;
            }

        }
        return resultado;

    }

    public Romano(int num) {
        if (equivalencias == null) {
            construirEquivalencias();
        }
        this.numRomano = intToRomano(num);
        this.equivalenteEntero = num;

    }

    public Romano(String enRomano) {
        if (equivalencias == null) {
            construirEquivalencias();

        }

    }
}
