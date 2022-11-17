/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dossier3;

import java.util.Scanner;

/**
 *
 * @author Cristo Manuel Glez Delgado <xrizglz@gmail.com>
 */
public class Anexo4 {
    
    
        
public int buscar(int[] números, int número) {

    return buscar(números, número, 0, números.length);
}

public int buscar(int[] números, int número, int inicio, int fin) {

    int centro = (inicio + fin) / 2;

    if (fin < inicio) {
         return -1;
    }

    if (número < números[centro]) {
        return buscar(números, número, inicio, centro - 1);
    }

    if (número > números[centro]) {
        return buscar(números, número, centro + 1, fin);
    }

    if (número == números[centro]) {
        return centro;
    }

    return -1;
}
   
        
    
   
       
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeros[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int pos = busca.buscar(numeros, 8);
        if (pos > -1) {
            System.out.println("Encontrado en la posicion: " + pos);
        } else {
            System.out.println("Error");
        }
    }
}