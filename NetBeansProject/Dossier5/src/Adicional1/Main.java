/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adicional1;

import java.util.ArrayList;

/**
 *
 * @author dam
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Hola");
        arr.add("Buenos días");
        arr.add("Adiós");

        System.out.println(arr.get(1));

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));

        }
        for (String string : arr) {
            System.out.println(string);
        }
    }

}
